import android.net.Uri;
import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface gNa
  extends sla, jta<gNa.d>, c
{
  public abstract XQa<APa> J();
  
  public abstract QQa<gNa.c> getViewActions();
  
  public static final class a
  {
    public static void a(gNa paramgNa, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      Object localObject = paramObject;
      if (!(paramObject instanceof WVa)) {
        localObject = null;
      }
      paramObject = (WVa)localObject;
      if (paramObject != null) {
        paramgNa.a(new gNa.d.b(parama, ((Boolean)((WVa)paramObject).a()).booleanValue(), ((Boolean)((WVa)paramObject).b()).booleanValue()));
      }
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("UPLOADING", 0);
      a = localb1;
      b localb2 = new b("GETTING_FILTERS", 1);
      b = localb2;
      b localb3 = new b("RUNNING_INIT_TASKS", 2);
      c = localb3;
      d = new b[] { localb1, localb2, localb3 };
    }
    
    private b() {}
  }
  
  public static abstract class c
  {
    public static abstract class a
      extends gNa.c
    {
      private a()
      {
        super();
      }
      
      public static final class a
        extends gNa.c.a
      {
        private final WVa<Float, Float> a;
        
        public a(WVa<Float, Float> paramWVa)
        {
          super();
          this.a = paramWVa;
        }
        
        public final WVa<Float, Float> a()
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
          WVa localWVa = this.a;
          int i;
          if (localWVa != null) {
            i = localWVa.hashCode();
          } else {
            i = 0;
          }
          return i;
        }
        
        public String toString()
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("FaceClicked(point=");
          localStringBuilder.append(this.a);
          localStringBuilder.append(")");
          return localStringBuilder.toString();
        }
      }
      
      public static final class b
        extends gNa.c.a
      {
        public static final b a = new b();
        
        private b()
        {
          super();
        }
      }
      
      public static final class c
        extends gNa.c.a
      {
        public static final c a = new c();
        
        private c()
        {
          super();
        }
      }
    }
    
    public static abstract class b
      extends gNa.c
    {
      private b()
      {
        super();
      }
      
      public static final class a
        extends gNa.c.b
      {
        public static final a a = new a();
        
        private a()
        {
          super();
        }
      }
      
      public static final class b
        extends gNa.c.b
      {
        public static final b a = new b();
        
        private b()
        {
          super();
        }
      }
      
      public static final class c
        extends gNa.c.b
      {
        public static final c a = new c();
        
        private c()
        {
          super();
        }
      }
    }
  }
  
  public static abstract class d
  {
    public static final class a
      extends gNa.d
    {
      private final Uri a;
      private final APa b;
      private final List<vka> c;
      
      public a(Uri paramUri, APa paramAPa, List<vka> paramList)
      {
        super();
        this.a = paramUri;
        this.b = paramAPa;
        this.c = paramList;
      }
      
      public final List<vka> a()
      {
        return this.c;
      }
      
      public final APa b()
      {
        return this.b;
      }
      
      public final Uri c()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
        Object localObject = this.a;
        int i = 0;
        int j;
        if (localObject != null) {
          j = ((Uri)localObject).hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        int k;
        if (localObject != null) {
          k = ((APa)localObject).hashCode();
        } else {
          k = 0;
        }
        localObject = this.c;
        if (localObject != null) {
          i = localObject.hashCode();
        }
        return (j * 31 + k) * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("FaceSelector(imageUri=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", imageSize=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", faces=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends gNa.d
    {
      private final c.a a;
      private final boolean b;
      private final boolean c;
      
      public b(c.a parama, boolean paramBoolean1, boolean paramBoolean2)
      {
        super();
        this.a = parama;
        this.b = paramBoolean1;
        this.c = paramBoolean2;
      }
      
      public final c.a a()
      {
        return this.a;
      }
      
      public final boolean b()
      {
        return this.b;
      }
      
      public final boolean c()
      {
        return this.c;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject)
        {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if (oXa.a(this.a, ((b)paramObject).a))
            {
              int i;
              if (this.b == ((b)paramObject).b) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                if (this.c == ((b)paramObject).c) {
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
        c.a locala = this.a;
        int i;
        if (locala != null) {
          i = locala.hashCode();
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
        localStringBuilder.append("NetworkError(error=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", isLogged=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", isPro=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends gNa.d
    {
      private final float a;
      private final gNa.b b;
      
      public c(float paramFloat, gNa.b paramb)
      {
        super();
        this.a = paramFloat;
        this.b = paramb;
      }
      
      public final float a()
      {
        return this.a;
      }
      
      public final gNa.b b()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if ((Float.compare(this.a, ((c)paramObject).a) == 0) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
        int i = Float.floatToIntBits(this.a);
        gNa.b localb = this.b;
        int j;
        if (localb != null) {
          j = localb.hashCode();
        } else {
          j = 0;
        }
        return i * 31 + j;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Progress(progress=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", step=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class d
      extends gNa.d
    {
      private final Eda a;
      
      public d(Eda paramEda)
      {
        super();
        this.a = paramEda;
      }
      
      public final Eda a()
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
        Eda localEda = this.a;
        int i;
        if (localEda != null) {
          i = localEda.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Success(photoOp=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gNa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */