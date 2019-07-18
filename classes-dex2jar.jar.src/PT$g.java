class PT$g
  implements PT.j
{
  private int a = 0;
  
  public float a(boolean paramBoolean1, float paramFloat1, boolean paramBoolean2, float paramFloat2)
  {
    this.a = (this.a * 53 + Float.floatToIntBits(paramFloat1));
    return paramFloat1;
  }
  
  public int a(boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2)
  {
    this.a = (this.a * 53 + paramInt1);
    return paramInt1;
  }
  
  public GT a(boolean paramBoolean1, GT paramGT1, boolean paramBoolean2, GT paramGT2)
  {
    this.a = (this.a * 53 + paramGT1.hashCode());
    return paramGT1;
  }
  
  public NT<PT.f> a(NT<PT.f> paramNT1, NT<PT.f> paramNT2)
  {
    this.a = (this.a * 53 + paramNT1.hashCode());
    return paramNT1;
  }
  
  public <T> QT.c<T> a(QT.c<T> paramc1, QT.c<T> paramc2)
  {
    this.a = (this.a * 53 + paramc1.hashCode());
    return paramc1;
  }
  
  public <T extends VT> T a(T paramT1, T paramT2)
  {
    int i;
    if (paramT1 != null)
    {
      if ((paramT1 instanceof PT)) {
        i = ((PT)paramT1).a(this);
      } else {
        i = paramT1.hashCode();
      }
    }
    else {
      i = 37;
    }
    this.a = (this.a * 53 + i);
    return paramT1;
  }
  
  public hU a(hU paramhU1, hU paramhU2)
  {
    this.a = (this.a * 53 + paramhU1.hashCode());
    return paramhU1;
  }
  
  public Object a(boolean paramBoolean, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (VT)paramObject1;
    a((VT)paramObject1, (VT)paramObject2);
    return paramObject1;
  }
  
  public String a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    this.a = (this.a * 53 + paramString1.hashCode());
    return paramString1;
  }
  
  public void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.a = (this.a * 53 + QT.a(paramBoolean2));
    return paramBoolean2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/PT$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */