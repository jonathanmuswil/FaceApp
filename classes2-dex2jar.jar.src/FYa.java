import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d;
import io.faceapp.ui.misc.c;
import java.util.Set;

public abstract interface fya
  extends sIa, c
{
  public abstract void a(Matrix paramMatrix, vka paramvka);
  
  public abstract void a(Bundle paramBundle, eBa parameBa, rka paramrka);
  
  public abstract void a(Bundle paramBundle, eBa parameBa, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean);
  
  public abstract void a(Bundle paramBundle, lya.g paramg);
  
  public abstract void a(Bundle paramBundle, mka parammka, QQa<Bitmap> paramQQa, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void a(Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean);
  
  public abstract void a(fya.a parama, Set<String> paramSet);
  
  public abstract void a(ResultingBitmapView.d paramd);
  
  public abstract void b(Bundle paramBundle, eBa parameBa, rka paramrka);
  
  public abstract void b(Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean);
  
  public abstract void c(Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean);
  
  public abstract Integer f();
  
  public abstract Bitmap g();
  
  public abstract QQa<fya.b> getViewActions();
  
  public static final class a
  {
    private final oka a;
    private final boolean b;
    private final boolean c;
    
    public a(oka paramoka, boolean paramBoolean1, boolean paramBoolean2)
    {
      this.a = paramoka;
      this.b = paramBoolean1;
      this.c = paramBoolean2;
    }
    
    public final boolean a()
    {
      return this.c;
    }
    
    public final oka b()
    {
      return this.a;
    }
    
    public final boolean c()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.c == ((a)paramObject).c) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label80;
              }
            }
          }
        }
        return false;
      }
      label80:
      return true;
    }
    
    public int hashCode()
    {
      oka localoka = this.a;
      int i;
      if (localoka != null) {
        i = localoka.hashCode();
      } else {
        i = 0;
      }
      int j = this.b;
      int k = j;
      int m;
      if (j != 0) {
        m = 1;
      }
      int n = this.c;
      j = n;
      if (n != 0) {
        j = 1;
      }
      return (i * 31 + m) * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ToolsModel(mode=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", isPro=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", demoMode=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends fya.b.c
    {
      public static final a a = new a();
    }
    
    public static final class b
      extends fya.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static abstract class c
      extends fya.b
    {
      public c()
      {
        super();
      }
    }
    
    public static final class d
      extends fya.b
    {
      private final Matrix a;
      
      public d(Matrix paramMatrix)
      {
        super();
        this.a = paramMatrix;
      }
      
      public final Matrix a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof d))
          {
            paramObject = (d)paramObject;
            if (oXa.a(this.a, ((d)paramObject).a)) {}
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
        Matrix localMatrix = this.a;
        int i;
        if (localMatrix != null) {
          i = localMatrix.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("MatrixChangedByUser(matrix=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class e
      extends fya.b
    {
      public static final e a = new e();
      
      private e()
      {
        super();
      }
    }
    
    public static final class f
      extends fya.b
    {
      public static final f a = new f();
      
      private f()
      {
        super();
      }
    }
    
    public static final class g
      extends fya.b
    {
      private final boolean a;
      
      public g(boolean paramBoolean)
      {
        super();
        this.a = paramBoolean;
      }
      
      public final boolean a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof g))
          {
            paramObject = (g)paramObject;
            int i;
            if (this.a == ((g)paramObject).a) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {}
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
        int i = this.a;
        int j = i;
        if (i != 0) {
          j = 1;
        }
        return j;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SetBefore(before=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class h
      extends fya.b
    {
      private final Bundle a;
      
      public h(Bundle paramBundle)
      {
        super();
        this.a = paramBundle;
      }
      
      public final Bundle a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof h))
          {
            paramObject = (h)paramObject;
            if (oXa.a(this.a, ((h)paramObject).a)) {}
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
        Bundle localBundle = this.a;
        int i;
        if (localBundle != null) {
          i = localBundle.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SetConfig(config=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class i
      extends fya.b
    {
      public static final i a = new i();
      
      private i()
      {
        super();
      }
    }
    
    public static final class j
      extends fya.b
    {
      private final mka a;
      
      public j(mka parammka)
      {
        super();
        this.a = parammka;
      }
      
      public final mka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof j))
          {
            paramObject = (j)paramObject;
            if (oXa.a(this.a, ((j)paramObject).a)) {}
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
        mka localmka = this.a;
        int i;
        if (localmka != null) {
          i = localmka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SwitchToFolder(folder=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class k
      extends fya.b
    {
      private final lya a;
      
      public k(lya paramlya)
      {
        super();
        this.a = paramlya;
      }
      
      public final lya a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof k))
          {
            paramObject = (k)paramObject;
            if (oXa.a(this.a, ((k)paramObject).a)) {}
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
        lya locallya = this.a;
        int i;
        if (locallya != null) {
          i = locallya.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SwitchToTool(type=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */