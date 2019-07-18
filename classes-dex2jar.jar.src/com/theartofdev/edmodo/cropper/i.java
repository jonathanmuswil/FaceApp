package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;

final class i
{
  private final RectF a = new RectF();
  private final RectF b = new RectF();
  private float c;
  private float d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private float k = 1.0F;
  private float l = 1.0F;
  
  private k.a a(float paramFloat1, float paramFloat2)
  {
    float f1 = this.a.width() / 6.0F;
    Object localObject = this.a;
    float f2 = ((RectF)localObject).left;
    float f3 = ((RectF)localObject).height() / 6.0F;
    float f4 = this.a.top;
    float f5 = f4 + f3;
    f3 = f4 + f3 * 5.0F;
    if (paramFloat1 < f2 + f1)
    {
      if (paramFloat2 < f5) {
        localObject = k.a.a;
      } else if (paramFloat2 < f3) {
        localObject = k.a.e;
      } else {
        localObject = k.a.c;
      }
    }
    else if (paramFloat1 < f2 + f1 * 5.0F)
    {
      if (paramFloat2 < f5) {
        localObject = k.a.f;
      } else if (paramFloat2 < f3) {
        localObject = k.a.i;
      } else {
        localObject = k.a.h;
      }
    }
    else if (paramFloat2 < f5) {
      localObject = k.a.b;
    } else if (paramFloat2 < f3) {
      localObject = k.a.g;
    } else {
      localObject = k.a.d;
    }
    return (k.a)localObject;
  }
  
  private k.a a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Object localObject = this.a;
    if (a(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).top, paramFloat3))
    {
      localObject = k.a.a;
    }
    else
    {
      localObject = this.a;
      if (a(paramFloat1, paramFloat2, ((RectF)localObject).right, ((RectF)localObject).top, paramFloat3))
      {
        localObject = k.a.b;
      }
      else
      {
        localObject = this.a;
        if (a(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).bottom, paramFloat3))
        {
          localObject = k.a.c;
        }
        else
        {
          localObject = this.a;
          if (a(paramFloat1, paramFloat2, ((RectF)localObject).right, ((RectF)localObject).bottom, paramFloat3))
          {
            localObject = k.a.d;
          }
          else
          {
            localObject = this.a;
            if ((a(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).top, ((RectF)localObject).right, ((RectF)localObject).bottom)) && (i()))
            {
              localObject = k.a.i;
            }
            else
            {
              localObject = this.a;
              if (b(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).right, ((RectF)localObject).top, paramFloat3))
              {
                localObject = k.a.f;
              }
              else
              {
                localObject = this.a;
                if (b(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).right, ((RectF)localObject).bottom, paramFloat3))
                {
                  localObject = k.a.h;
                }
                else
                {
                  localObject = this.a;
                  if (c(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).top, ((RectF)localObject).bottom, paramFloat3))
                  {
                    localObject = k.a.e;
                  }
                  else
                  {
                    localObject = this.a;
                    if (c(paramFloat1, paramFloat2, ((RectF)localObject).right, ((RectF)localObject).top, ((RectF)localObject).bottom, paramFloat3))
                    {
                      localObject = k.a.g;
                    }
                    else
                    {
                      localObject = this.a;
                      if ((a(paramFloat1, paramFloat2, ((RectF)localObject).left, ((RectF)localObject).top, ((RectF)localObject).right, ((RectF)localObject).bottom)) && (!i())) {
                        localObject = k.a.i;
                      } else {
                        localObject = null;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return (k.a)localObject;
  }
  
  private static boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    boolean bool;
    if ((Math.abs(paramFloat1 - paramFloat3) <= paramFloat5) && (Math.abs(paramFloat2 - paramFloat4) <= paramFloat5)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    boolean bool;
    if ((paramFloat1 > paramFloat3) && (paramFloat1 < paramFloat5) && (paramFloat2 > paramFloat4) && (paramFloat2 < paramFloat6)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    boolean bool;
    if ((paramFloat1 > paramFloat3) && (paramFloat1 < paramFloat4) && (Math.abs(paramFloat2 - paramFloat5) <= paramFloat6)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    boolean bool;
    if ((Math.abs(paramFloat1 - paramFloat3) <= paramFloat6) && (paramFloat2 > paramFloat4) && (paramFloat2 < paramFloat5)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean i()
  {
    return h() ^ true;
  }
  
  public float a()
  {
    return Math.min(this.f, this.j / this.l);
  }
  
  public k a(float paramFloat1, float paramFloat2, float paramFloat3, CropImageView.b paramb)
  {
    if (paramb == CropImageView.b.b) {
      paramb = a(paramFloat1, paramFloat2);
    } else {
      paramb = a(paramFloat1, paramFloat2, paramFloat3);
    }
    if (paramb != null) {
      paramb = new k(paramb, this, paramFloat1, paramFloat2);
    } else {
      paramb = null;
    }
    return paramb;
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.k = paramFloat3;
    this.l = paramFloat4;
  }
  
  public void a(RectF paramRectF)
  {
    this.a.set(paramRectF);
  }
  
  public void a(f paramf)
  {
    this.c = paramf.x;
    this.d = paramf.y;
    this.g = paramf.z;
    this.h = paramf.A;
    this.i = paramf.B;
    this.j = paramf.C;
  }
  
  public float b()
  {
    return Math.min(this.e, this.i / this.k);
  }
  
  public float c()
  {
    return Math.max(this.d, this.h / this.l);
  }
  
  public float d()
  {
    return Math.max(this.c, this.g / this.k);
  }
  
  public RectF e()
  {
    this.b.set(this.a);
    return this.b;
  }
  
  public float f()
  {
    return this.l;
  }
  
  public float g()
  {
    return this.k;
  }
  
  public boolean h()
  {
    boolean bool;
    if ((this.a.width() >= 100.0F) && (this.a.height() >= 100.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */