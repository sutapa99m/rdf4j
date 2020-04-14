package org.eclipse.rdf4j.sail.shacl.abstractsyntaxtree.phase0.constraintcomponents;

import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Resource;
import org.eclipse.rdf4j.model.vocabulary.SHACL;

import java.util.Set;

public class MinInclusiveConstraintComponent implements ConstraintComponent {

	Literal minInclusive;

	public MinInclusiveConstraintComponent(ConstraintComponent parent, Literal minInclusive) {
		this.minInclusive = minInclusive;
	}

	@Override
	public void toModel(Resource subject, Model model, Set<Resource> exported) {
		model.add(subject, SHACL.MIN_INCLUSIVE, minInclusive);
	}
}
