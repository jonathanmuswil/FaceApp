import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class rc
{
  public static float a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return paramFloat;
    }
    return paramTypedArray.getFloat(paramInt, paramFloat);
  }
  
  public static int a(Context paramContext, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt1, localTypedValue, true);
    if (localTypedValue.resourceId != 0) {
      return paramInt1;
    }
    return paramInt2;
  }
  
  public static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramTypedArray.getInt(paramInt1, paramTypedArray.getInt(paramInt2, paramInt3));
  }
  
  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return paramInt2;
    }
    return paramTypedArray.getColor(paramInt1, paramInt2);
  }
  
  public static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
  
  public static Drawable a(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    Drawable localDrawable1 = paramTypedArray.getDrawable(paramInt1);
    Drawable localDrawable2 = localDrawable1;
    if (localDrawable1 == null) {
      localDrawable2 = paramTypedArray.getDrawable(paramInt2);
    }
    return localDrawable2;
  }
  
  public static String a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return null;
    }
    return paramTypedArray.getString(paramInt);
  }
  
  public static kc a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt1, int paramInt2)
  {
    if (a(paramXmlPullParser, paramString))
    {
      paramXmlPullParser = new TypedValue();
      paramTypedArray.getValue(paramInt1, paramXmlPullParser);
      int i = paramXmlPullParser.type;
      if ((i >= 28) && (i <= 31)) {
        return kc.a(paramXmlPullParser.data);
      }
      paramTypedArray = kc.a(paramTypedArray.getResources(), paramTypedArray.getResourceId(paramInt1, 0), paramTheme);
      if (paramTypedArray != null) {
        return paramTypedArray;
      }
    }
    return kc.a(paramInt2);
  }
  
  public static boolean a(TypedArray paramTypedArray, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return paramTypedArray.getBoolean(paramInt1, paramTypedArray.getBoolean(paramInt2, paramBoolean));
  }
  
  public static boolean a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return paramBoolean;
    }
    return paramTypedArray.getBoolean(paramInt, paramBoolean);
  }
  
  public static boolean a(XmlPullParser paramXmlPullParser, String paramString)
  {
    boolean bool;
    if (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int b(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramTypedArray.getResourceId(paramInt1, paramTypedArray.getResourceId(paramInt2, paramInt3));
  }
  
  public static int b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return paramInt2;
    }
    return paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static TypedValue b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return null;
    }
    return paramTypedArray.peekValue(paramInt);
  }
  
  public static String b(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    String str1 = paramTypedArray.getString(paramInt1);
    String str2 = str1;
    if (str1 == null) {
      str2 = paramTypedArray.getString(paramInt2);
    }
    return str2;
  }
  
  public static int c(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString)) {
      return paramInt2;
    }
    return paramTypedArray.getResourceId(paramInt1, paramInt2);
  }
  
  public static CharSequence c(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence1 = paramTypedArray.getText(paramInt1);
    CharSequence localCharSequence2 = localCharSequence1;
    if (localCharSequence1 == null) {
      localCharSequence2 = paramTypedArray.getText(paramInt2);
    }
    return localCharSequence2;
  }
  
  public static CharSequence[] d(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    CharSequence[] arrayOfCharSequence1 = paramTypedArray.getTextArray(paramInt1);
    CharSequence[] arrayOfCharSequence2 = arrayOfCharSequence1;
    if (arrayOfCharSequence1 == null) {
      arrayOfCharSequence2 = paramTypedArray.getTextArray(paramInt2);
    }
    return arrayOfCharSequence2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */