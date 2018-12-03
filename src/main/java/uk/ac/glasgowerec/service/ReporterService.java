package uk.ac.glasgowerec.service;

import java.util.List;

import uk.ac.glasgowerec.domain.Reporter;

public interface ReporterService {

	public List<Reporter> findAll();
	public Reporter findById(Long id);
	public Reporter save(Reporter reporter);
	
}