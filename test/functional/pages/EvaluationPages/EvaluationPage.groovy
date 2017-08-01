package pages.EvaluationPages

import geb.Page

/**
 * Created by Danilo on 23/06/2016.
 */
class EvaluationPage extends Page {

    static url = "/TA/evaluation/index"

    static at =  {
        title ==~ /Evaluation List/
    }

    boolean confirmEvalaution(String value,String criterionName,String evaluationOrigin) {
        boolean r = false
		boolean findLogin = $("tr")find("td").has("a",text: evaluationOrigin)
		boolean findValue = $("tr").has("td",text:value)
        boolean findName = $("tr").has("td",text: criterionName)
        if(findLogin && findValue && findName){
            r = true
        }
        return r
    }

}