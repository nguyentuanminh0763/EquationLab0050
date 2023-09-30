package EquationProgram.controller;

import EquationProgram.responsitory.ComputingEquation;
import EquationProgram.view.Menu;


public class Programming extends Menu<String>{
    private ComputingEquation computing = new ComputingEquation();

    public Programming() {
        super("========Equation Program========", new String[]{"Calculate Superlative Equation","Calculate Quadratic Equation","Exit"});
    }
    
    
    @Override
    public void excute(int n) {
        switch (n) {
            case 1:
                computing.superlativeEquation();
                break;
            case 2:
                computing.quadraticEquation();
                break;
            default:
                System.out.println("GoodBye");
        }
    }

    
}
