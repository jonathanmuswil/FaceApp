import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class Ua$a
  extends Ua.e
{
  public Ua$a() {}
  
  public Ua$a(a parama)
  {
    super(parama);
  }
  
  private void a(TypedArray paramTypedArray)
  {
    String str = paramTypedArray.getString(0);
    if (str != null) {
      this.b = str;
    }
    paramTypedArray = paramTypedArray.getString(1);
    if (paramTypedArray != null) {
      this.a = tc.a(paramTypedArray);
    }
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    if (!rc.a(paramXmlPullParser, "pathData")) {
      return;
    }
    paramResources = rc.a(paramResources, paramTheme, paramAttributeSet, Ka.d);
    a(paramResources);
    paramResources.recycle();
  }
  
  public boolean b()
  {
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */