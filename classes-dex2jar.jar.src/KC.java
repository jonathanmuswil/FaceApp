import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class kc
{
  private final Shader a;
  private final ColorStateList b;
  private int c;
  
  private kc(Shader paramShader, ColorStateList paramColorStateList, int paramInt)
  {
    this.a = paramShader;
    this.b = paramColorStateList;
    this.c = paramInt;
  }
  
  static kc a(int paramInt)
  {
    return new kc(null, null, paramInt);
  }
  
  static kc a(ColorStateList paramColorStateList)
  {
    return new kc(null, paramColorStateList, paramColorStateList.getDefaultColor());
  }
  
  public static kc a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      paramResources = b(paramResources, paramInt, paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", paramResources);
    }
    return null;
  }
  
  static kc a(Shader paramShader)
  {
    return new kc(paramShader, null, 0);
  }
  
  private static kc b(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    throws IOException, XmlPullParserException
  {
    XmlResourceParser localXmlResourceParser = paramResources.getXml(paramInt);
    AttributeSet localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
    do
    {
      paramInt = localXmlResourceParser.next();
    } while ((paramInt != 2) && (paramInt != 1));
    if (paramInt == 2)
    {
      String str = localXmlResourceParser.getName();
      paramInt = -1;
      int i = str.hashCode();
      if (i != 89650992)
      {
        if ((i == 1191572447) && (str.equals("selector"))) {
          paramInt = 0;
        }
      }
      else if (str.equals("gradient")) {
        paramInt = 1;
      }
      if (paramInt != 0)
      {
        if (paramInt == 1) {
          return a(mc.a(paramResources, localXmlResourceParser, localAttributeSet, paramTheme));
        }
        paramResources = new StringBuilder();
        paramResources.append(localXmlResourceParser.getPositionDescription());
        paramResources.append(": unsupported complex color tag ");
        paramResources.append(str);
        throw new XmlPullParserException(paramResources.toString());
      }
      return a(jc.a(paramResources, localXmlResourceParser, localAttributeSet, paramTheme));
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public int a()
  {
    return this.c;
  }
  
  public boolean a(int[] paramArrayOfInt)
  {
    if (d())
    {
      ColorStateList localColorStateList = this.b;
      int i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
      if (i != this.c)
      {
        bool = true;
        this.c = i;
        break label44;
      }
    }
    boolean bool = false;
    label44:
    return bool;
  }
  
  public Shader b()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public boolean c()
  {
    boolean bool;
    if (this.a != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean d()
  {
    if (this.a == null)
    {
      ColorStateList localColorStateList = this.b;
      if ((localColorStateList != null) && (localColorStateList.isStateful())) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public boolean e()
  {
    boolean bool;
    if ((!c()) && (this.c == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */