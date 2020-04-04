package com.mystream.dom;

import com.mongodb.lang.NonNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.OneToMany;
import java.net.URI;
import java.util.List;


@Document(collection = "TextAnnotation")
public class TextAnnotation implements Annotation  {

	@Transient
	public static final String SEQUENCE_NAME = "text_anno_seq";

	@Getter
	@Setter
	@NonNull
	@Field("@id")
	private String id;

	@OneToMany
	@Field("@context")
	private List<String> context;

	@Getter
	@Setter
	@OneToMany
	@Field("@type")
	private List<TypeEnum> type;

	@Getter
	@Setter
	private List<MotivationEnum> motivation;

	@Getter
	@Setter
	private Annotator annotatedBy;

	@Getter
	@Setter
	private Serializer serializedBy;

	/**
	 * Annotations have 0 or more bodies.
	 */
	@Getter
	@Setter
	private List<Body> body;

	/**
	 * Annotations have 1 or more bodies.
	 */
	@Getter
	@Setter
	@NonNull
	private List<Target> target;









}

