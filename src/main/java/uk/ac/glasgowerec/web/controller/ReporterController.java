package uk.ac.glasgowerec.web.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.glasgowerec.domain.Reporter;
import uk.ac.glasgowerec.service.ReporterService;
import uk.ac.glasgowerec.web.form.Message;
import uk.ac.glasgowerec.web.util.UrlUtil;

@RequestMapping("/reporters")
@Controller
public class ReporterController {
	
	
	
	final Logger logger = LoggerFactory.getLogger(ReporterController.class);
	
	@Autowired
	private ReporterService reporterService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model uiModel) {
	logger.info("Listing reporters");
	List<Reporter> reporters = reporterService.findAll();
	uiModel.addAttribute("reporters", reporters);
	logger.info("No. of reporters: " + reporters.size());
	return "reporters/list";
	}

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String show(@PathVariable("id") Long id, Model uiModel) {
	Reporter reporter = reporterService.findById(id);
	uiModel.addAttribute("reporter", reporter);
	return "reporters/show";
	}
	
	
	@Autowired
	MessageSource messageSource;
	@RequestMapping(value = "/{id}", params = "form", method = RequestMethod.POST)
	public String update(Reporter reporter, BindingResult bindingResult, Model uiModel,
	HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
	logger.info("Updating reporter");
	if (bindingResult.hasErrors()) {
	uiModel.addAttribute("message", new Message("error",
	messageSource.getMessage("reporter_save_fail", new Object[]{}, locale)));
	uiModel.addAttribute("reporter", reporter);
	return "reporters/update";
	}
	uiModel.asMap().clear();
	redirectAttributes.addFlashAttribute("message", new Message("success",
	messageSource.getMessage("reporter_save_success", new Object[]{}, locale)));
	reporterService.save(reporter);
	return "redirect:/reporters/" + UrlUtil.encodeUrlPathSegment(reporter.getId().toString(),
	httpServletRequest);
	}
	
	
	@RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model uiModel) {
	uiModel.addAttribute("reporter", reporterService.findById(id));
	return "reporters/update";
	}
	
	@RequestMapping(params = "form", method = RequestMethod.POST)
	public String create(Reporter reporter, BindingResult bindingResult, Model uiModel,
	HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
	logger.info("Creating reporter");
	if (bindingResult.hasErrors()) {
	uiModel.addAttribute("message", new Message("error",
	messageSource.getMessage("reporter_save_fail", new Object[]{}, locale)));
	uiModel.addAttribute("reporter", reporter);
	return "reporters/create";
	}
	uiModel.asMap().clear();
	redirectAttributes.addFlashAttribute("message", new Message("success",
	messageSource.getMessage("reporter_save_success", new Object[]{}, locale)));
	logger.info("Reporter id: " + reporter.getId());
	reporterService.save(reporter);
	return "redirect:/reporters/" + UrlUtil.encodeUrlPathSegment(reporter.getId().toString(),
	httpServletRequest);
	}
	@RequestMapping(params = "form", method = RequestMethod.GET)
	public String createForm(Model uiModel) {
	Reporter reporter = new Reporter();
	uiModel.addAttribute("reporter", reporter);
	return "reporters/create";
	}
	}
	
	
	
