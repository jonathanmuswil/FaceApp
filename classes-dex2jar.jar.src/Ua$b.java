import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class Ua$b
  extends Ua.e
{
  private int[] d;
  kc e;
  float f = 0.0F;
  kc g;
  float h = 1.0F;
  int i = 0;
  float j = 1.0F;
  float k = 0.0F;
  float l = 1.0F;
  float m = 0.0F;
  Paint.Cap n = Paint.Cap.BUTT;
  Paint.Join o = Paint.Join.MITER;
  float p = 4.0F;
  
  public Ua$b() {}
  
  public Ua$b(b paramb)
  {
    super(paramb);
    this.d = paramb.d;
    this.e = paramb.e;
    this.f = paramb.f;
    this.h = paramb.h;
    this.g = paramb.g;
    this.i = paramb.i;
    this.j = paramb.j;
    this.k = paramb.k;
    this.l = paramb.l;
    this.m = paramb.m;
    this.n = paramb.n;
    this.o = paramb.o;
    this.p = paramb.p;
  }
  
  private Paint.Cap a(int paramInt, Paint.Cap paramCap)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return paramCap;
        }
        return Paint.Cap.SQUARE;
      }
      return Paint.Cap.ROUND;
    }
    return Paint.Cap.BUTT;
  }
  
  private Paint.Join a(int paramInt, Paint.Join paramJoin)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return paramJoin;
        }
        return Paint.Join.BEVEL;
      }
      return Paint.Join.ROUND;
    }
    return Paint.Join.MITER;
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    this.d = null;
    if (!rc.a(paramXmlPullParser, "pathData")) {
      return;
    }
    String str = paramTypedArray.getString(0);
    if (str != null) {
      this.b = str;
    }
    str = paramTypedArray.getString(2);
    if (str != null) {
      this.a = tc.a(str);
    }
    this.g = rc.a(paramTypedArray, paramXmlPullParser, paramTheme, "fillColor", 1, 0);
    this.j = rc.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.j);
    this.n = a(rc.b(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), this.n);
    this.o = a(rc.b(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), this.o);
    this.p = rc.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.p);
    this.e = rc.a(paramTypedArray, paramXmlPullParser, paramTheme, "strokeColor", 3, 0);
    this.h = rc.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.h);
    this.f = rc.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.f);
    this.l = rc.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.l);
    this.m = rc.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.m);
    this.k = rc.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.k);
    this.i = rc.b(paramTypedArray, paramXmlPullParser, "fillType", 13, this.i);
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = rc.a(paramResources, paramTheme, paramAttributeSet, Ka.c);
    a(paramResources, paramXmlPullParser, paramTheme);
    paramResources.recycle();
  }
  
  public boolean a()
  {
    boolean bool;
    if ((!this.g.d()) && (!this.e.d())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean a(int[] paramArrayOfInt)
  {
    boolean bool = this.g.a(paramArrayOfInt);
    return this.e.a(paramArrayOfInt) | bool;
  }
  
  float getFillAlpha()
  {
    return this.j;
  }
  
  int getFillColor()
  {
    return this.g.a();
  }
  
  float getStrokeAlpha()
  {
    return this.h;
  }
  
  int getStrokeColor()
  {
    return this.e.a();
  }
  
  float getStrokeWidth()
  {
    return this.f;
  }
  
  float getTrimPathEnd()
  {
    return this.l;
  }
  
  float getTrimPathOffset()
  {
    return this.m;
  }
  
  float getTrimPathStart()
  {
    return this.k;
  }
  
  void setFillAlpha(float paramFloat)
  {
    this.j = paramFloat;
  }
  
  void setFillColor(int paramInt)
  {
    this.g.b(paramInt);
  }
  
  void setStrokeAlpha(float paramFloat)
  {
    this.h = paramFloat;
  }
  
  void setStrokeColor(int paramInt)
  {
    this.e.b(paramInt);
  }
  
  void setStrokeWidth(float paramFloat)
  {
    this.f = paramFloat;
  }
  
  void setTrimPathEnd(float paramFloat)
  {
    this.l = paramFloat;
  }
  
  void setTrimPathOffset(float paramFloat)
  {
    this.m = paramFloat;
  }
  
  void setTrimPathStart(float paramFloat)
  {
    this.k = paramFloat;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */