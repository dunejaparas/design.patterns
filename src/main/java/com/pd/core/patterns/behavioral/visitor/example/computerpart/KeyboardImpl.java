package com.pd.core.patterns.behavioral.visitor.example.computerpart;

public class KeyboardImpl implements IComputerPart {

    @Override
    public void accept(final IComputerPartVisitor computerPartVisitor) {
	computerPartVisitor.visit(this);
    }
}