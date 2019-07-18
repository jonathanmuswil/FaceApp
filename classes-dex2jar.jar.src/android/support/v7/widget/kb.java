package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.util.TypedValue;
import sc;

class kb
{
  private static final ThreadLocal<TypedValue> a = new ThreadLocal();
  static final int[] b = { -16842910 };
  static final int[] c = { 16842908 };
  static final int[] d = { 16843518 };
  static final int[] e = { 16842919 };
  static final int[] f = { 16842912 };
  static final int[] g = { 16842913 };
  static final int[] h = { -16842919, -16842908 };
  static final int[] i = new int[0];
  private static final int[] j = new int[1];
  
  public static int a(Context paramContext, int paramInt)
  {
    Object localObject = c(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {
      return ((ColorStateList)localObject).getColorForState(b, ((ColorStateList)localObject).getDefaultColor());
    }
    localObject = a();
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    return a(paramContext, paramInt, ((TypedValue)localObject).getFloat());
  }
  
  static int a(Context paramContext, int paramInt, float paramFloat)
  {
    paramInt = b(paramContext, paramInt);
    return sc.c(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  private static TypedValue a()
  {
    TypedValue localTypedValue1 = (TypedValue)a.get();
    TypedValue localTypedValue2 = localTypedValue1;
    if (localTypedValue1 == null)
    {
      localTypedValue2 = new TypedValue();
      a.set(localTypedValue2);
    }
    return localTypedValue2;
  }
  
  public static int b(Context paramContext, int paramInt)
  {
    Object localObject = j;
    localObject[0] = paramInt;
    localObject = pb.a(paramContext, null, (int[])localObject);
    try
    {
      paramInt = ((pb)localObject).a(0, 0);
      return paramInt;
    }
    finally
    {
      ((pb)localObject).a();
    }
  }
  
  public static ColorStateList c(Context paramContext, int paramInt)
  {
    Object localObject1 = j;
    localObject1[0] = paramInt;
    paramContext = pb.a(paramContext, null, (int[])localObject1);
    try
    {
      localObject1 = paramContext.a(0);
      return (ColorStateList)localObject1;
    }
    finally
    {
      paramContext.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */