import java.util.List;

public class PT$h
  implements PT.j
{
  public static final h a = new h();
  
  public float a(boolean paramBoolean1, float paramFloat1, boolean paramBoolean2, float paramFloat2)
  {
    if (paramBoolean2) {
      paramFloat1 = paramFloat2;
    }
    return paramFloat1;
  }
  
  public int a(boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2)
  {
    if (paramBoolean2) {
      paramInt1 = paramInt2;
    }
    return paramInt1;
  }
  
  public GT a(boolean paramBoolean1, GT paramGT1, boolean paramBoolean2, GT paramGT2)
  {
    if (paramBoolean2) {
      paramGT1 = paramGT2;
    }
    return paramGT1;
  }
  
  public NT<PT.f> a(NT<PT.f> paramNT1, NT<PT.f> paramNT2)
  {
    Object localObject = paramNT1;
    if (paramNT1.a()) {
      localObject = paramNT1.clone();
    }
    ((NT)localObject).a(paramNT2);
    return (NT<PT.f>)localObject;
  }
  
  public <T> QT.c<T> a(QT.c<T> paramc1, QT.c<T> paramc2)
  {
    int i = paramc1.size();
    int j = paramc2.size();
    Object localObject = paramc1;
    if (i > 0)
    {
      localObject = paramc1;
      if (j > 0)
      {
        localObject = paramc1;
        if (!paramc1.j()) {
          localObject = paramc1.d(j + i);
        }
        ((List)localObject).addAll(paramc2);
      }
    }
    if (i <= 0) {
      localObject = paramc2;
    }
    return (QT.c<T>)localObject;
  }
  
  public <T extends VT> T a(T paramT1, T paramT2)
  {
    if ((paramT1 != null) && (paramT2 != null))
    {
      paramT1 = paramT1.c();
      paramT1.a(paramT2);
      return paramT1.build();
    }
    if (paramT1 == null) {
      paramT1 = paramT2;
    }
    return paramT1;
  }
  
  public hU a(hU paramhU1, hU paramhU2)
  {
    if (paramhU2 != hU.a()) {
      paramhU1 = hU.a(paramhU1, paramhU2);
    }
    return paramhU1;
  }
  
  public Object a(boolean paramBoolean, Object paramObject1, Object paramObject2)
  {
    if (paramBoolean) {
      return a((VT)paramObject1, (VT)paramObject2);
    }
    return paramObject2;
  }
  
  public String a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    if (paramBoolean2) {
      paramString1 = paramString2;
    }
    return paramString1;
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if (paramBoolean3) {
      paramBoolean2 = paramBoolean4;
    }
    return paramBoolean2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/PT$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */