import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class jc
{
  private static int a(int paramInt, float paramFloat)
  {
    return paramInt & 0xFFFFFF | Math.round(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return a(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    String str = paramXmlPullParser.getName();
    if (str.equals("selector")) {
      return b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid color state list tag ");
    paramResources.append(str);
    throw new XmlPullParserException(paramResources.toString());
  }
  
  private static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      paramResources = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    } else {
      paramResources = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
    }
    return paramResources;
  }
  
  private static ColorStateList b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth() + 1;
    int[][] arrayOfInt = new int[20][];
    int[] arrayOfInt1 = new int[arrayOfInt.length];
    int j = 0;
    for (;;)
    {
      int k = paramXmlPullParser.next();
      if (k == 1) {
        break;
      }
      int m = paramXmlPullParser.getDepth();
      if ((m < i) && (k == 3)) {
        break;
      }
      if ((k == 2) && (m <= i) && (paramXmlPullParser.getName().equals("item")))
      {
        Object localObject = a(paramResources, paramTheme, paramAttributeSet, k.ColorStateListItem);
        int n = ((TypedArray)localObject).getColor(k.ColorStateListItem_android_color, -65281);
        float f = 1.0F;
        if (((TypedArray)localObject).hasValue(k.ColorStateListItem_android_alpha)) {
          f = ((TypedArray)localObject).getFloat(k.ColorStateListItem_android_alpha, 1.0F);
        } else if (((TypedArray)localObject).hasValue(k.ColorStateListItem_alpha)) {
          f = ((TypedArray)localObject).getFloat(k.ColorStateListItem_alpha, 1.0F);
        }
        ((TypedArray)localObject).recycle();
        int i1 = paramAttributeSet.getAttributeCount();
        localObject = new int[i1];
        m = 0;
        int i3;
        for (k = 0; m < i1; k = i3)
        {
          int i2 = paramAttributeSet.getAttributeNameResource(m);
          i3 = k;
          if (i2 != 16843173)
          {
            i3 = k;
            if (i2 != 16843551)
            {
              i3 = k;
              if (i2 != i.alpha)
              {
                if (paramAttributeSet.getAttributeBooleanValue(m, false)) {
                  i3 = i2;
                } else {
                  i3 = -i2;
                }
                localObject[k] = i3;
                i3 = k + 1;
              }
            }
          }
          m++;
        }
        localObject = StateSet.trimStateSet((int[])localObject, k);
        k = a(n, f);
        if (j != 0) {
          m = localObject.length;
        }
        arrayOfInt1 = nc.a(arrayOfInt1, j, k);
        arrayOfInt = (int[][])nc.a(arrayOfInt, j, localObject);
        j++;
      }
    }
    paramResources = new int[j];
    paramXmlPullParser = new int[j][];
    System.arraycopy(arrayOfInt1, 0, paramResources, 0, j);
    System.arraycopy(arrayOfInt, 0, paramXmlPullParser, 0, j);
    return new ColorStateList(paramXmlPullParser, paramResources);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */