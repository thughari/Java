package java8.javascriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
//will only work in java 8
public class NashornJSEngine {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine nashorn = engineManager.getEngineByName("nashorn");

        String script = "var name = 'hari';name;";
        System.out.println(nashorn.eval(script));
    }
}
