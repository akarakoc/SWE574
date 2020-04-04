package com.mystream.service;

import com.mystream.dom.TextAnnotation;
import com.mystream.repo.TextAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceImpl implements AnnotationService {

	@Autowired
	TextAnnotationRepository textRepository;

	@Override
	public TextAnnotation saveTextAnnotation(TextAnnotation anno){
		return textRepository.save(anno);
	}


}
