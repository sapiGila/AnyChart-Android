package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Table mapping proxy that supports selection
 */
public class TableSelectable extends JsObject {

    public TableSelectable() {
        js.setLength(0);
        js.append("var tableSelectable").append(++variableIndex).append(" = anychart.data.tableSelectable();");
        jsBase = "tableSelectable" + variableIndex;
    }

    protected TableSelectable(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableSelectable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double key;
    private TableSearchMode mode;
    private String mode1;
    private List<TableselectableRowProxy> setSearch = new ArrayList<>();

    /**
     * Searches asked key with asked mode and returns an object that allows values fetching.
     */
    public TableselectableRowProxy search(Double key, TableSearchMode mode) {
        if (jsBase == null) {
            this.key = key;
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.key = key;
            this.mode = mode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch" + ++variableIndex + " = " + jsBase + ".search(%f, %s);", key, ((mode != null) ? mode.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s)", key, ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        TableselectableRowProxy item = new TableselectableRowProxy("setSearch" + variableIndex);
        setSearch.add(item);
        return item;
    }
    private String generateJSsetSearch() {
        if (!setSearch.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableselectableRowProxy item : setSearch) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableselectableRowProxy> setSearch1 = new ArrayList<>();

    /**
     * Searches asked key with asked mode and returns an object that allows values fetching.
     */
    public TableselectableRowProxy search(Double key, String mode1) {
        if (jsBase == null) {
            this.key = key;
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.key = key;
            this.mode1 = mode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch1" + ++variableIndex + " = " + jsBase + ".search(%f, %s);", key, wrapQuotes(mode1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s)", key, wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        TableselectableRowProxy item = new TableselectableRowProxy("setSearch1" + variableIndex);
        setSearch1.add(item);
        return item;
    }
    private String generateJSsetSearch1() {
        if (!setSearch1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableselectableRowProxy item : setSearch1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startDate;
    private String startDate1;
    private Double endDate;
    private String endDate1;
    private Interval intervalUnit;
    private String intervalUnit1;
    private Double intervalCount;
    private List<TableSelectable> setSelect = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, Double intervalCount, Double endDate, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%f, %f, %f, %s)", startDate, intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %f, %s)", startDate, intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect1 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, Double intervalCount, Double endDate, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%f, %f, %f, %s)", startDate, intervalCount, endDate, wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %f, %s)", startDate, intervalCount, endDate, wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect2 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, Double intervalCount, String endDate1, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%f, %f, %s, %s)", startDate, intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %s, %s)", startDate, intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect2() {
        if (!setSelect2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect3 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(Double startDate, Double intervalCount, String endDate1, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate = startDate;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%f, %f, %s, %s)", startDate, intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f, %s, %s)", startDate, intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect3() {
        if (!setSelect3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect4 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Double intervalCount, Double endDate, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %f, %f, %s)", wrapQuotes(startDate1), intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %f, %s)", wrapQuotes(startDate1), intervalCount, endDate, ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect4() {
        if (!setSelect4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect5 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Double intervalCount, Double endDate, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = endDate;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %f, %f, %s)", wrapQuotes(startDate1), intervalCount, endDate, wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %f, %s)", wrapQuotes(startDate1), intervalCount, endDate, wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect5() {
        if (!setSelect5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect6 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Double intervalCount, String endDate1, Interval intervalUnit) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit = intervalUnit;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %f, %s, %s)", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %s, %s)", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), ((intervalUnit != null) ? intervalUnit.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect6() {
        if (!setSelect6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelect7 = new ArrayList<>();

    /**
     * Selects asked range.
     */
    public TableSelectable select(String startDate1, Double intervalCount, String endDate1, String intervalUnit1) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
        } else {
            this.startDate1 = startDate1;
            this.intervalCount = intervalCount;
            this.endDate1 = endDate1;
            this.intervalUnit1 = intervalUnit1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s, %f, %s, %s)", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s, %f, %s, %s)", wrapQuotes(startDate1), intervalCount, wrapQuotes(endDate1), wrapQuotes(intervalUnit1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect7() {
        if (!setSelect7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelect7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Interval intervalUnit2;
    private String intervalUnit3;
    private Double intervalCount1;
    private List<TableSelectable> setSelectAll = new ArrayList<>();

    /**
     * Selects the full range of the storage.
     */
    public TableSelectable selectAll(Interval intervalUnit2, Double intervalCount1) {
        if (jsBase == null) {
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            this.intervalUnit2 = null;
            this.intervalUnit3 = null;
            
            this.intervalUnit2 = intervalUnit2;
            this.intervalCount = null;
            this.intervalCount1 = null;
            
            this.intervalCount1 = intervalCount1;
        } else {
            this.intervalUnit2 = intervalUnit2;
            this.intervalCount1 = intervalCount1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectAll(%s, %f)", ((intervalUnit2 != null) ? intervalUnit2.generateJs() : "null"), intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectAll(%s, %f)", ((intervalUnit2 != null) ? intervalUnit2.generateJs() : "null"), intervalCount1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectAll() {
        if (!setSelectAll.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelectAll) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableSelectable> setSelectAll1 = new ArrayList<>();

    /**
     * Selects the full range of the storage.
     */
    public TableSelectable selectAll(String intervalUnit3, Double intervalCount1) {
        if (jsBase == null) {
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            this.intervalUnit2 = null;
            this.intervalUnit3 = null;
            
            this.intervalUnit3 = intervalUnit3;
            this.intervalCount = null;
            this.intervalCount1 = null;
            
            this.intervalCount1 = intervalCount1;
        } else {
            this.intervalUnit3 = intervalUnit3;
            this.intervalCount1 = intervalCount1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectAll(%s, %f)", wrapQuotes(intervalUnit3), intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectAll(%s, %f)", wrapQuotes(intervalUnit3), intervalCount1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectAll1() {
        if (!setSelectAll1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableSelectable item : setSelectAll1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetSearch());
        js.append(generateJSsetSearch1());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelect1());
        js.append(generateJSsetSelect2());
        js.append(generateJSsetSelect3());
        js.append(generateJSsetSelect4());
        js.append(generateJSsetSelect5());
        js.append(generateJSsetSelect6());
        js.append(generateJSsetSelect7());
        js.append(generateJSsetSelectAll());
        js.append(generateJSsetSelectAll1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}