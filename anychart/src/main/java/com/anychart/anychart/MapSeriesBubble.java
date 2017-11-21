package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Bubble series.
 */
public class MapSeriesBubble extends MapSeriesBaseWithMarkers {

    public MapSeriesBubble() {
        js.setLength(0);
        js.append("var mapSeriesBubble").append(++variableIndex).append(" = anychart.core.map.series.bubble();");
        jsBase = "mapSeriesBubble" + variableIndex;
    }

    protected MapSeriesBubble(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected MapSeriesBubble(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean displayNegative;
    private List<MapSeriesBubble> setDisplayNegative = new ArrayList<>();

    /**
     * Setter for the negative value option.
     */
    public MapSeriesBubble setDisplayNegative(Boolean displayNegative) {
        if (jsBase == null) {
            this.displayNegative = displayNegative;
        } else {
            this.displayNegative = displayNegative;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".displayNegative(%b)", displayNegative));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayNegative(%b)", displayNegative));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisplayNegative() {
        if (!setDisplayNegative.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setDisplayNegative) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill negativeFill;
    private List<MapSeriesBubble> setNegativeFill = new ArrayList<>();

    /**
     * Setter for series negative fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble setNegativeFill(Fill negativeFill) {
        if (jsBase == null) {
            this.negativeFill = negativeFill;
        } else {
            this.negativeFill = negativeFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill() {
        if (!setNegativeFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<MapSeriesBubble> setNegativeFill1 = new ArrayList<>();

    /**
     * Series negative fill color with opacity. Fill as a string or an object.
     */
    public MapSeriesBubble negativeFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill1() {
        if (!setNegativeFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<MapSeriesBubble> setNegativeFill2 = new ArrayList<>();

    /**
     * Linear gradient series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill2() {
        if (!setNegativeFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeFill3 = new ArrayList<>();

    /**
     * Linear gradient series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill3() {
        if (!setNegativeFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeFill4 = new ArrayList<>();

    /**
     * Linear gradient series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill4() {
        if (!setNegativeFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeFill5 = new ArrayList<>();

    /**
     * Linear gradient series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill5() {
        if (!setNegativeFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeFill6 = new ArrayList<>();

    /**
     * Linear gradient series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill6() {
        if (!setNegativeFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeFill7 = new ArrayList<>();

    /**
     * Linear gradient series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(String[] keys1, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill7() {
        if (!setNegativeFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<MapSeriesBubble> setNegativeFill8 = new ArrayList<>();

    /**
     * Radial series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill8() {
        if (!setNegativeFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeFill9 = new ArrayList<>();

    /**
     * Radial series negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public MapSeriesBubble negativeFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill9() {
        if (!setNegativeFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private PatternFill getNegativeHatchFill;

    /**
     * Getter fot the negative hatch fill.
     */
    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill(jsBase + ".negativeHatchFill()");

        return getNegativeHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color1;
    private Double thickness;
    private Double size;
    private List<MapSeriesBubble> setNegativeHatchFill = new ArrayList<>();

    /**
     * Setter for the negative hatch fill.
     */
    public MapSeriesBubble setNegativeHatchFill(PatternFill patternFillOrTypeOrState, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrTypeOrState.generateJs());
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill() {
        if (!setNegativeHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeHatchFill1 = new ArrayList<>();

    /**
     * Setter for the negative hatch fill.
     */
    public MapSeriesBubble setNegativeHatchFill(HatchFill patternFillOrTypeOrState1, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrTypeOrState1.generateJs());
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill1() {
        if (!setNegativeHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeHatchFill2 = new ArrayList<>();

    /**
     * Setter for the negative hatch fill.
     */
    public MapSeriesBubble setNegativeHatchFill(HatchFillType patternFillOrTypeOrState2, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill2() {
        if (!setNegativeHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeHatchFill3 = new ArrayList<>();

    /**
     * Setter for the negative hatch fill.
     */
    public MapSeriesBubble setNegativeHatchFill(String patternFillOrTypeOrState3, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill3() {
        if (!setNegativeHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeHatchFill4 = new ArrayList<>();

    /**
     * Setter for the negative hatch fill.
     */
    public MapSeriesBubble setNegativeHatchFill(Boolean patternFillOrTypeOrState4, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill4() {
        if (!setNegativeHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MapSeriesBubble getNegativeStroke;

    /**
     * Getter for negative stroke settings.
     */
    public MapSeriesBubble getNegativeStroke() {
        if (getNegativeStroke == null)
            getNegativeStroke = new MapSeriesBubble(jsBase + ".negativeStroke()");

        return getNegativeStroke;
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<MapSeriesBubble> setNegativeStroke = new ArrayList<>();

    /**
     * Setter for series negative stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public MapSeriesBubble setNegativeStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color2 = color2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke() {
        if (!setNegativeStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeStroke1 = new ArrayList<>();

    /**
     * Setter for series negative stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public MapSeriesBubble setNegativeStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke1() {
        if (!setNegativeStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setNegativeStroke2 = new ArrayList<>();

    /**
     * Setter for series negative stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public MapSeriesBubble setNegativeStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke2() {
        if (!setNegativeStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setNegativeStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeStroke() {
        if (getNegativeStroke != null) {
            return getNegativeStroke.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetNegativeHatchFill());
        jsGetters.append(generateJSgetNegativeStroke());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDisplayNegative());
        js.append(generateJSsetNegativeFill());
        js.append(generateJSsetNegativeFill1());
        js.append(generateJSsetNegativeFill2());
        js.append(generateJSsetNegativeFill3());
        js.append(generateJSsetNegativeFill4());
        js.append(generateJSsetNegativeFill5());
        js.append(generateJSsetNegativeFill6());
        js.append(generateJSsetNegativeFill7());
        js.append(generateJSsetNegativeFill8());
        js.append(generateJSsetNegativeFill9());
        js.append(generateJSsetNegativeHatchFill());
        js.append(generateJSsetNegativeHatchFill1());
        js.append(generateJSsetNegativeHatchFill2());
        js.append(generateJSsetNegativeHatchFill3());
        js.append(generateJSsetNegativeHatchFill4());
        js.append(generateJSsetNegativeStroke());
        js.append(generateJSsetNegativeStroke1());
        js.append(generateJSsetNegativeStroke2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}