/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.edu.csye6200.controller;

import neu.edu.csye6200.views.PanelImmRules;

/**
 *
 * @author jarvis
 */
public class ImmRulesController {
    
    private PanelImmRules viewStateRules;
    private static ImmRulesController instance;
    static ImmRulesController getInstance(PanelImmRules viewStateRules) {
        instance = new ImmRulesController(viewStateRules);
        return instance;  
    }

    private ImmRulesController(PanelImmRules viewStateRules) {
        this.viewStateRules= viewStateRules;
    }
}
