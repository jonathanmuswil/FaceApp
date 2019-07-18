import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class lc
{
  private static int a(TypedArray paramTypedArray, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramTypedArray.getType(paramInt);
    }
    TypedValue localTypedValue = new TypedValue();
    paramTypedArray.getValue(paramInt, localTypedValue);
    return localTypedValue.type;
  }
  
  public static List<List<byte[]>> a(Resources paramResources, int paramInt)
  {
    if (paramInt == 0) {
      return Collections.emptyList();
    }
    TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
    try
    {
      if (localTypedArray.length() == 0)
      {
        paramResources = Collections.emptyList();
        return paramResources;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (a(localTypedArray, 0) == 1) {
        for (paramInt = 0; paramInt < localTypedArray.length(); paramInt++)
        {
          int i = localTypedArray.getResourceId(paramInt, 0);
          if (i != 0) {
            localArrayList.add(a(paramResources.getStringArray(i)));
          }
        }
      }
      localArrayList.add(a(paramResources.getStringArray(paramInt)));
      return localArrayList;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  private static List<byte[]> a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Base64.decode(paramArrayOfString[j], 0));
    }
    return localArrayList;
  }
  
  public static lc.a a(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return b(paramXmlPullParser, paramResources);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  private static void a(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlPullParser.next();
      if (j != 2)
      {
        if (j == 3) {
          i--;
        }
      }
      else {
        i++;
      }
    }
  }
  
  private static lc.a b(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family")) {
      return c(paramXmlPullParser, paramResources);
    }
    a(paramXmlPullParser);
    return null;
  }
  
  private static lc.a c(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), k.FontFamily);
    Object localObject = localTypedArray.getString(k.FontFamily_fontProviderAuthority);
    String str1 = localTypedArray.getString(k.FontFamily_fontProviderPackage);
    String str2 = localTypedArray.getString(k.FontFamily_fontProviderQuery);
    int i = localTypedArray.getResourceId(k.FontFamily_fontProviderCerts, 0);
    int j = localTypedArray.getInteger(k.FontFamily_fontProviderFetchStrategy, 1);
    int k = localTypedArray.getInteger(k.FontFamily_fontProviderFetchTimeout, 500);
    localTypedArray.recycle();
    if ((localObject != null) && (str1 != null) && (str2 != null))
    {
      while (paramXmlPullParser.next() != 3) {
        a(paramXmlPullParser);
      }
      return new lc.d(new Qc((String)localObject, str1, str2, a(paramResources, i)), j, k);
    }
    localObject = new ArrayList();
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equals("font")) {
          ((List)localObject).add(d(paramXmlPullParser, paramResources));
        } else {
          a(paramXmlPullParser);
        }
      }
    }
    if (((List)localObject).isEmpty()) {
      return null;
    }
    return new lc.b((lc.c[])((List)localObject).toArray(new lc.c[((List)localObject).size()]));
  }
  
  private static lc.c d(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), k.FontFamilyFont);
    int i;
    if (localTypedArray.hasValue(k.FontFamilyFont_fontWeight)) {
      i = k.FontFamilyFont_fontWeight;
    } else {
      i = k.FontFamilyFont_android_fontWeight;
    }
    int j = localTypedArray.getInt(i, 400);
    if (localTypedArray.hasValue(k.FontFamilyFont_fontStyle)) {
      i = k.FontFamilyFont_fontStyle;
    } else {
      i = k.FontFamilyFont_android_fontStyle;
    }
    boolean bool;
    if (1 == localTypedArray.getInt(i, 0)) {
      bool = true;
    } else {
      bool = false;
    }
    if (localTypedArray.hasValue(k.FontFamilyFont_ttcIndex)) {
      i = k.FontFamilyFont_ttcIndex;
    } else {
      i = k.FontFamilyFont_android_ttcIndex;
    }
    if (localTypedArray.hasValue(k.FontFamilyFont_fontVariationSettings)) {
      k = k.FontFamilyFont_fontVariationSettings;
    } else {
      k = k.FontFamilyFont_android_fontVariationSettings;
    }
    String str = localTypedArray.getString(k);
    int k = localTypedArray.getInt(i, 0);
    if (localTypedArray.hasValue(k.FontFamilyFont_font)) {
      i = k.FontFamilyFont_font;
    } else {
      i = k.FontFamilyFont_android_font;
    }
    int m = localTypedArray.getResourceId(i, 0);
    paramResources = localTypedArray.getString(i);
    localTypedArray.recycle();
    while (paramXmlPullParser.next() != 3) {
      a(paramXmlPullParser);
    }
    return new lc.c(paramResources, j, bool, str, k, m);
  }
  
  public static abstract interface a {}
  
  public static final class b
    implements lc.a
  {
    private final lc.c[] a;
    
    public b(lc.c[] paramArrayOfc)
    {
      this.a = paramArrayOfc;
    }
    
    public lc.c[] a()
    {
      return this.a;
    }
  }
  
  public static final class c
  {
    private final String a;
    private int b;
    private boolean c;
    private String d;
    private int e;
    private int f;
    
    public c(String paramString1, int paramInt1, boolean paramBoolean, String paramString2, int paramInt2, int paramInt3)
    {
      this.a = paramString1;
      this.b = paramInt1;
      this.c = paramBoolean;
      this.d = paramString2;
      this.e = paramInt2;
      this.f = paramInt3;
    }
    
    public String a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.f;
    }
    
    public int c()
    {
      return this.e;
    }
    
    public String d()
    {
      return this.d;
    }
    
    public int e()
    {
      return this.b;
    }
    
    public boolean f()
    {
      return this.c;
    }
  }
  
  public static final class d
    implements lc.a
  {
    private final Qc a;
    private final int b;
    private final int c;
    
    public d(Qc paramQc, int paramInt1, int paramInt2)
    {
      this.a = paramQc;
      this.c = paramInt1;
      this.b = paramInt2;
    }
    
    public int a()
    {
      return this.c;
    }
    
    public Qc b()
    {
      return this.a;
    }
    
    public int c()
    {
      return this.b;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */