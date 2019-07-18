class PT$c
  implements PT.j
{
  static final c a = new c();
  static final PT.c.a b = new PT.c.a();
  
  public float a(boolean paramBoolean1, float paramFloat1, boolean paramBoolean2, float paramFloat2)
  {
    if ((paramBoolean1 == paramBoolean2) && (paramFloat1 == paramFloat2)) {
      return paramFloat1;
    }
    throw b;
  }
  
  public int a(boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2)
  {
    if ((paramBoolean1 == paramBoolean2) && (paramInt1 == paramInt2)) {
      return paramInt1;
    }
    throw b;
  }
  
  public GT a(boolean paramBoolean1, GT paramGT1, boolean paramBoolean2, GT paramGT2)
  {
    if ((paramBoolean1 == paramBoolean2) && (paramGT1.equals(paramGT2))) {
      return paramGT1;
    }
    throw b;
  }
  
  public NT<PT.f> a(NT<PT.f> paramNT1, NT<PT.f> paramNT2)
  {
    if (paramNT1.equals(paramNT2)) {
      return paramNT1;
    }
    throw b;
  }
  
  public <T> QT.c<T> a(QT.c<T> paramc1, QT.c<T> paramc2)
  {
    if (paramc1.equals(paramc2)) {
      return paramc1;
    }
    throw b;
  }
  
  public <T extends VT> T a(T paramT1, T paramT2)
  {
    if ((paramT1 == null) && (paramT2 == null)) {
      return null;
    }
    if ((paramT1 != null) && (paramT2 != null))
    {
      ((PT)paramT1).a(this, paramT2);
      return paramT1;
    }
    throw b;
  }
  
  public hU a(hU paramhU1, hU paramhU2)
  {
    if (paramhU1.equals(paramhU2)) {
      return paramhU1;
    }
    throw b;
  }
  
  public Object a(boolean paramBoolean, Object paramObject1, Object paramObject2)
  {
    if ((paramBoolean) && (((PT)paramObject1).a(this, (VT)paramObject2))) {
      return paramObject1;
    }
    throw b;
  }
  
  public String a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    if ((paramBoolean1 == paramBoolean2) && (paramString1.equals(paramString2))) {
      return paramString1;
    }
    throw b;
  }
  
  public void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    throw b;
  }
  
  public boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramBoolean1 == paramBoolean3) && (paramBoolean2 == paramBoolean4)) {
      return paramBoolean2;
    }
    throw b;
  }
  
  static final class a
    extends RuntimeException
  {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/PT$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */