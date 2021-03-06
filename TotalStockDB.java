/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.sql.Timestamp;

/**
 *
 * @author User
 */
public class TotalStockDB {

    private int id ; 
    private Timestamp date;
    private String product;
    private String storage;
    private double quantity;
    private double unit;
    private String unitType;
    private double totalKg;
    private double totalMon;

    public String getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(String quantity2) {
        this.quantity2 = quantity2;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getTotalKg2() {
        return totalKg2;
    }

    public void setTotalKg2(String totalKg2) {
        this.totalKg2 = totalKg2;
    }

    public String getTotalMon2() {
        return totalMon2;
    }

    public void setTotalMon2(String totalMon2) {
        this.totalMon2 = totalMon2;
    }
    
    private String quantity2;
    private String unit2;
    private String totalKg2;
    private String totalMon2;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public double getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(double totalKg) {
        this.totalKg = totalKg;
    }

    public double getTotalMon() {
        return totalMon;
    }

    public void setTotalMon(double totalMon) {
        this.totalMon = totalMon;
    }

    public TotalStockDB(int id, Timestamp date, String product, String storage, double quantity, double unit, String unitType, double totalKg, double totalMon) {
        this.id = id;
        this.date = date;
        this.product = product;
        this.storage = storage;
        this.quantity = quantity;
        this.unit = unit;
        this.unitType = unitType;
        this.totalKg = totalKg;
        this.totalMon = totalMon;
        
        this.quantity2 = IntegerTextField.numformat(quantity);
        this.totalKg2 = IntegerTextField.numformat(totalKg);
        this.totalMon2 = IntegerTextField.numformat(totalMon);
        this.unit2 = String.valueOf((int)unit)+" "+String.valueOf(unitType);
        
    }

    public TotalStockDB() {
    }


    
}