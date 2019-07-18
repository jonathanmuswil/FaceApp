package io.faceapp.ui.image_editor.filter_editor;

import QQa;
import android.graphics.Bitmap;
import lka;
import mka;
import oXa;
import pxa;
import pya;
import sla;
import zza;

public abstract interface s
  extends sla, zza
{
  public abstract void a(a parama, pxa parampxa);
  
  public abstract void a(mka parammka);
  
  public abstract void b(float paramFloat);
  
  public abstract QQa<b> getViewActions();
  
  public static final class a
  {
    private final Bitmap a;
    private final mka b;
    private final boolean c;
    private final boolean d;
    
    public a(Bitmap paramBitmap, mka parammka, boolean paramBoolean1, boolean paramBoolean2)
    {
      this.a = paramBitmap;
      this.b = parammka;
      this.c = paramBoolean1;
      this.d = paramBoolean2;
    }
    
    public final boolean a()
    {
      return this.d;
    }
    
    public final mka b()
    {
      return this.b;
    }
    
    public final Bitmap c()
    {
      return this.a;
    }
    
    public final boolean d()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)))
          {
            int i;
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.d == ((a)paramObject).d) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label94;
              }
            }
          }
        }
        return false;
      }
      label94:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((mka)localObject).hashCode();
      }
      int k = this.c;
      int m = k;
      int n;
      if (k != 0) {
        n = 1;
      }
      int i1 = this.d;
      k = i1;
      if (i1 != 0) {
        k = 1;
      }
      return ((j * 31 + i) * 31 + n) * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FolderModel(thumb=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", folder=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", isPro=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", demoMode=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends s.b
    {
      private final lka a;
      
      public a(lka paramlka)
      {
        super();
        this.a = paramlka;
      }
      
      public final lka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if (oXa.a(this.a, ((a)paramObject).a)) {}
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      
      public int hashCode()
      {
        lka locallka = this.a;
        int i;
        if (locallka != null) {
          i = locallka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectFilter(filter=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends s.b
    {
      private final lka a;
      
      public b(lka paramlka)
      {
        super();
        this.a = paramlka;
      }
      
      public final lka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if (oXa.a(this.a, ((b)paramObject).a)) {}
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      
      public int hashCode()
      {
        lka locallka = this.a;
        int i;
        if (locallka != null) {
          i = locallka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectPro(filter=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends s.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends s.b
    {
      private final String a;
      private final String b;
      
      public d(String paramString1, String paramString2)
      {
        super();
        this.a = paramString1;
        this.b = paramString2;
      }
      
      public final String a()
      {
        return this.a;
      }
      
      public final String b()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof d))
          {
            paramObject = (d)paramObject;
            if ((oXa.a(this.a, ((d)paramObject).a)) && (oXa.a(this.b, ((d)paramObject).b))) {}
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      
      public int hashCode()
      {
        String str = this.a;
        int i = 0;
        int j;
        if (str != null) {
          j = str.hashCode();
        } else {
          j = 0;
        }
        str = this.b;
        if (str != null) {
          i = str.hashCode();
        }
        return j * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectSubFilter(filterId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", subId=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class e
      extends s.b
    {
      private final pya a;
      private final float b;
      
      public e(pya parampya, float paramFloat)
      {
        super();
        this.a = parampya;
        this.b = paramFloat;
      }
      
      public final pya a()
      {
        return this.a;
      }
      
      public final float b()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof e))
          {
            paramObject = (e)paramObject;
            if ((oXa.a(this.a, ((e)paramObject).a)) && (Float.compare(this.b, ((e)paramObject).b) == 0)) {}
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      
      public int hashCode()
      {
        pya localpya = this.a;
        int i;
        if (localpya != null) {
          i = localpya.hashCode();
        } else {
          i = 0;
        }
        return i * 31 + Float.floatToIntBits(this.b);
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SetValue(range=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", value=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */