import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class Ua$c
  extends Ua.d
{
  final Matrix a = new Matrix();
  final ArrayList<Ua.d> b = new ArrayList();
  float c = 0.0F;
  private float d = 0.0F;
  private float e = 0.0F;
  private float f = 1.0F;
  private float g = 1.0F;
  private float h = 0.0F;
  private float i = 0.0F;
  final Matrix j = new Matrix();
  int k;
  private int[] l;
  private String m = null;
  
  public Ua$c()
  {
    super(null);
  }
  
  public Ua$c(c paramc, gd<String, Object> paramgd)
  {
    super(null);
    this.c = paramc.c;
    this.d = paramc.d;
    this.e = paramc.e;
    this.f = paramc.f;
    this.g = paramc.g;
    this.h = paramc.h;
    this.i = paramc.i;
    this.l = paramc.l;
    this.m = paramc.m;
    this.k = paramc.k;
    Object localObject = this.m;
    if (localObject != null) {
      paramgd.put(localObject, this);
    }
    this.j.set(paramc.j);
    localObject = paramc.b;
    int n = 0;
    while (n < ((ArrayList)localObject).size())
    {
      paramc = ((ArrayList)localObject).get(n);
      if ((paramc instanceof c))
      {
        paramc = (c)paramc;
        this.b.add(new c(paramc, paramgd));
      }
      else
      {
        if ((paramc instanceof Ua.b))
        {
          paramc = new Ua.b((Ua.b)paramc);
        }
        else
        {
          if (!(paramc instanceof Ua.a)) {
            break label316;
          }
          paramc = new Ua.a((Ua.a)paramc);
        }
        this.b.add(paramc);
        String str = paramc.b;
        if (str != null) {
          paramgd.put(str, paramc);
        }
      }
      n++;
      continue;
      label316:
      throw new IllegalStateException("Unknown object in the tree!");
    }
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    this.l = null;
    this.c = rc.a(paramTypedArray, paramXmlPullParser, "rotation", 5, this.c);
    this.d = paramTypedArray.getFloat(1, this.d);
    this.e = paramTypedArray.getFloat(2, this.e);
    this.f = rc.a(paramTypedArray, paramXmlPullParser, "scaleX", 3, this.f);
    this.g = rc.a(paramTypedArray, paramXmlPullParser, "scaleY", 4, this.g);
    this.h = rc.a(paramTypedArray, paramXmlPullParser, "translateX", 6, this.h);
    this.i = rc.a(paramTypedArray, paramXmlPullParser, "translateY", 7, this.i);
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null) {
      this.m = paramTypedArray;
    }
    b();
  }
  
  private void b()
  {
    this.j.reset();
    this.j.postTranslate(-this.d, -this.e);
    this.j.postScale(this.f, this.g);
    this.j.postRotate(this.c, 0.0F, 0.0F);
    this.j.postTranslate(this.h + this.d, this.i + this.e);
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = rc.a(paramResources, paramTheme, paramAttributeSet, Ka.b);
    a(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
  
  public boolean a()
  {
    for (int n = 0; n < this.b.size(); n++) {
      if (((Ua.d)this.b.get(n)).a()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(int[] paramArrayOfInt)
  {
    int n = 0;
    boolean bool = false;
    while (n < this.b.size())
    {
      bool |= ((Ua.d)this.b.get(n)).a(paramArrayOfInt);
      n++;
    }
    return bool;
  }
  
  public String getGroupName()
  {
    return this.m;
  }
  
  public Matrix getLocalMatrix()
  {
    return this.j;
  }
  
  public float getPivotX()
  {
    return this.d;
  }
  
  public float getPivotY()
  {
    return this.e;
  }
  
  public float getRotation()
  {
    return this.c;
  }
  
  public float getScaleX()
  {
    return this.f;
  }
  
  public float getScaleY()
  {
    return this.g;
  }
  
  public float getTranslateX()
  {
    return this.h;
  }
  
  public float getTranslateY()
  {
    return this.i;
  }
  
  public void setPivotX(float paramFloat)
  {
    if (paramFloat != this.d)
    {
      this.d = paramFloat;
      b();
    }
  }
  
  public void setPivotY(float paramFloat)
  {
    if (paramFloat != this.e)
    {
      this.e = paramFloat;
      b();
    }
  }
  
  public void setRotation(float paramFloat)
  {
    if (paramFloat != this.c)
    {
      this.c = paramFloat;
      b();
    }
  }
  
  public void setScaleX(float paramFloat)
  {
    if (paramFloat != this.f)
    {
      this.f = paramFloat;
      b();
    }
  }
  
  public void setScaleY(float paramFloat)
  {
    if (paramFloat != this.g)
    {
      this.g = paramFloat;
      b();
    }
  }
  
  public void setTranslateX(float paramFloat)
  {
    if (paramFloat != this.h)
    {
      this.h = paramFloat;
      b();
    }
  }
  
  public void setTranslateY(float paramFloat)
  {
    if (paramFloat != this.i)
    {
      this.i = paramFloat;
      b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */