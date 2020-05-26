/*
 * Copyright © 2017-2019 Harvard Pilgrim Health Care Institute (HPHCI) and its Contributors.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * Funding Source: Food and Drug Administration (“Funding Agency”) effective 18 September 2014 as Contract no. HHSF22320140030I/HHSF22301006T (the “Prime Contract”).
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.harvard.storagemodule.events;

import java.util.HashMap;

public class DatabaseEvent<E> {
  private String tableName;
  private String operation; // insert, select, delete
  private String type; // for inserting, copy or copy and update
  private E obj;
  private HashMap<String, String> whereParams = new HashMap<>(); //  for select where conditions
  private Class classObj;

  public HashMap<String, String> getWhereParams() {
    return whereParams;
  }

  public void setWhereParams(HashMap<String, String> whereParams) {
    this.whereParams = whereParams;
  }

  public String getmType() {
    return type;
  }

  public void setmType(String type) {
    this.type = type;
  }

  public E getE() {
    return obj;
  }

  public void setE(E obj) {
    this.obj = obj;
  }

  public Class getaClass() {
    return classObj;
  }

  public void setaClass(Class classObj) {
    this.classObj = classObj;
  }

  public String getmOperation() {
    return operation;
  }

  public void setmOperation(String operation) {
    this.operation = operation;
  }

  public String getmTableName() {
    return tableName;
  }

  public void setmTableName(String tableName) {
    this.tableName = tableName;
  }
}
