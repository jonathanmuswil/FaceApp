import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class mc
{
  private static Shader.TileMode a(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return Shader.TileMode.CLAMP;
      }
      return Shader.TileMode.MIRROR;
    }
    return Shader.TileMode.REPEAT;
  }
  
  static Shader a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws IOException, XmlPullParserException
  {
    Object localObject = paramXmlPullParser.getName();
    if (((String)localObject).equals("gradient"))
    {
      localObject = rc.a(paramResources, paramTheme, paramAttributeSet, k.GradientColor);
      float f1 = rc.a((TypedArray)localObject, paramXmlPullParser, "startX", k.GradientColor_android_startX, 0.0F);
      float f2 = rc.a((TypedArray)localObject, paramXmlPullParser, "startY", k.GradientColor_android_startY, 0.0F);
      float f3 = rc.a((TypedArray)localObject, paramXmlPullParser, "endX", k.GradientColor_android_endX, 0.0F);
      float f4 = rc.a((TypedArray)localObject, paramXmlPullParser, "endY", k.GradientColor_android_endY, 0.0F);
      float f5 = rc.a((TypedArray)localObject, paramXmlPullParser, "centerX", k.GradientColor_android_centerX, 0.0F);
      float f6 = rc.a((TypedArray)localObject, paramXmlPullParser, "centerY", k.GradientColor_android_centerY, 0.0F);
      int i = rc.b((TypedArray)localObject, paramXmlPullParser, "type", k.GradientColor_android_type, 0);
      int j = rc.a((TypedArray)localObject, paramXmlPullParser, "startColor", k.GradientColor_android_startColor, 0);
      boolean bool = rc.a(paramXmlPullParser, "centerColor");
      int k = rc.a((TypedArray)localObject, paramXmlPullParser, "centerColor", k.GradientColor_android_centerColor, 0);
      int m = rc.a((TypedArray)localObject, paramXmlPullParser, "endColor", k.GradientColor_android_endColor, 0);
      int n = rc.b((TypedArray)localObject, paramXmlPullParser, "tileMode", k.GradientColor_android_tileMode, 0);
      float f7 = rc.a((TypedArray)localObject, paramXmlPullParser, "gradientRadius", k.GradientColor_android_gradientRadius, 0.0F);
      ((TypedArray)localObject).recycle();
      paramResources = a(b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme), j, m, bool, k);
      if (i != 1)
      {
        if (i != 2) {
          return new LinearGradient(f1, f2, f3, f4, paramResources.a, paramResources.b, a(n));
        }
        return new SweepGradient(f5, f6, paramResources.a, paramResources.b);
      }
      if (f7 > 0.0F) {
        return new RadialGradient(f5, f6, f7, paramResources.a, paramResources.b, a(n));
      }
      throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid gradient color tag ");
    paramResources.append((String)localObject);
    throw new XmlPullParserException(paramResources.toString());
  }
  
  private static mc.a a(mc.a parama, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if (parama != null) {
      return parama;
    }
    if (paramBoolean) {
      return new mc.a(paramInt1, paramInt3, paramInt2);
    }
    return new mc.a(paramInt1, paramInt2);
  }
  
  private static mc.a b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth() + 1;
    ArrayList localArrayList1 = new ArrayList(20);
    ArrayList localArrayList2 = new ArrayList(20);
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (j == 1) {
        break label242;
      }
      int k = paramXmlPullParser.getDepth();
      if ((k < i) && (j == 3)) {
        break label242;
      }
      if ((j == 2) && (k <= i) && (paramXmlPullParser.getName().equals("item")))
      {
        TypedArray localTypedArray = rc.a(paramResources, paramTheme, paramAttributeSet, k.GradientColorItem);
        boolean bool1 = localTypedArray.hasValue(k.GradientColorItem_android_color);
        boolean bool2 = localTypedArray.hasValue(k.GradientColorItem_android_offset);
        if ((!bool1) || (!bool2)) {
          break;
        }
        k = localTypedArray.getColor(k.GradientColorItem_android_color, 0);
        float f = localTypedArray.getFloat(k.GradientColorItem_android_offset, 0.0F);
        localTypedArray.recycle();
        localArrayList2.add(Integer.valueOf(k));
        localArrayList1.add(Float.valueOf(f));
      }
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": <item> tag requires a 'color' attribute and a 'offset' ");
    paramResources.append("attribute!");
    throw new XmlPullParserException(paramResources.toString());
    label242:
    if (localArrayList2.size() > 0) {
      return new mc.a(localArrayList2, localArrayList1);
    }
    return null;
  }
  
  static final class a
  {
    final int[] a;
    final float[] b;
    
    a(int paramInt1, int paramInt2)
    {
      this.a = new int[] { paramInt1, paramInt2 };
      this.b = new float[] { 0.0F, 1.0F };
    }
    
    a(int paramInt1, int paramInt2, int paramInt3)
    {
      this.a = new int[] { paramInt1, paramInt2, paramInt3 };
      this.b = new float[] { 0.0F, 0.5F, 1.0F };
    }
    
    a(List<Integer> paramList, List<Float> paramList1)
    {
      int i = paramList.size();
      this.a = new int[i];
      this.b = new float[i];
      for (int j = 0; j < i; j++)
      {
        this.a[j] = ((Integer)paramList.get(j)).intValue();
        this.b[j] = ((Float)paramList1.get(j)).floatValue();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */