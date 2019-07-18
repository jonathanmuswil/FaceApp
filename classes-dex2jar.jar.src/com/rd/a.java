package com.rd;

import MW;
import PW.a;
import QW;
import sX;
import xX;

public class a
  implements PW.a
{
  private sX a;
  private MW b;
  private a c;
  
  a(a parama)
  {
    this.c = parama;
    this.a = new sX();
    this.b = new MW(this.a.a(), this);
  }
  
  public MW a()
  {
    return this.b;
  }
  
  public void a(QW paramQW)
  {
    this.a.a(paramQW);
    paramQW = this.c;
    if (paramQW != null) {
      paramQW.h();
    }
  }
  
  public sX b()
  {
    return this.a;
  }
  
  public xX c()
  {
    return this.a.a();
  }
  
  static abstract interface a
  {
    public abstract void h();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/rd/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */