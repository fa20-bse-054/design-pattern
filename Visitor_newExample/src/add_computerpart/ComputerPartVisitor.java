/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add_computerpart;

/**
 *
 * @author fa20-bse-054
 */
public interface ComputerPartVisitor {
    void visit(Motherboard motherboard);
}