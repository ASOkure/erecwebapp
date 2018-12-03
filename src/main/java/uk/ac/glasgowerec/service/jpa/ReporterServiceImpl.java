package uk.ac.glasgowerec.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

import uk.ac.glasgowerec.domain.Reporter;
import uk.ac.glasgowerec.repository.ReporterRepository;
import uk.ac.glasgowerec.service.ReporterService;

@Service("reporterService")
@Repository
@Transactional
public class ReporterServiceImpl implements ReporterService {

	@Autowired
	private ReporterRepository reporterRepository;
	@Transactional(readOnly=true)
	public List<Reporter> findAll() {
	return Lists.newArrayList(reporterRepository.findAll());
	}
	@Transactional(readOnly=true)
	public Reporter findById(Long id) {
	return reporterRepository.findOne(id);
	}
	public Reporter save(Reporter reporter) {
	return reporterRepository.save(reporter);
	}
	}
	

