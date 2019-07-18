import android.graphics.Bitmap;
import android.net.Uri;
import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface lxa
  extends sIa, c
{
  public abstract void a(lxa.b paramb);
  
  public abstract void a(lxa.c paramc);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract QQa<Boolean> ea();
  
  public abstract QQa<lxa.e> getViewActions();
  
  public abstract void l();
  
  public static final class a
  {
    public static void a(lxa paramlxa, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      paramlxa.a(new lxa.b.c(parama));
    }
  }
  
  public static abstract class b
  {
    public static abstract class a
      extends lxa.b
    {
      private final Eka a;
      private final lxa.d b;
      private final boolean c;
      
      private a(Eka paramEka, lxa.d paramd, boolean paramBoolean)
      {
        super();
        this.a = paramEka;
        this.b = paramd;
        this.c = paramBoolean;
      }
      
      public final Eka a()
      {
        return this.a;
      }
      
      public final lxa.d b()
      {
        return this.b;
      }
      
      public final boolean c()
      {
        return this.c;
      }
      
      public static final class a
        extends lxa.b.a
      {
        private final Eka d;
        private final lxa.d e;
        private final boolean f;
        private final Uri g;
        private final APa h;
        private final boolean i;
        private final APa j;
        
        public a(Eka paramEka, lxa.d paramd, boolean paramBoolean1, Uri paramUri, APa paramAPa1, boolean paramBoolean2, APa paramAPa2)
        {
          super(paramd, paramBoolean1, null);
          this.d = paramEka;
          this.e = paramd;
          this.f = paramBoolean1;
          this.g = paramUri;
          this.h = paramAPa1;
          this.i = paramBoolean2;
          this.j = paramAPa2;
        }
        
        public final boolean d()
        {
          return this.i;
        }
        
        public final APa e()
        {
          return this.h;
        }
        
        public boolean equals(Object paramObject)
        {
          if (this != paramObject)
          {
            if ((paramObject instanceof a))
            {
              paramObject = (a)paramObject;
              if ((oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)))
              {
                int k;
                if (this.f == ((a)paramObject).f) {
                  k = 1;
                } else {
                  k = 0;
                }
                if ((k != 0) && (oXa.a(this.g, ((a)paramObject).g)) && (oXa.a(this.h, ((a)paramObject).h)))
                {
                  if (this.i == ((a)paramObject).i) {
                    k = 1;
                  } else {
                    k = 0;
                  }
                  if ((k != 0) && (oXa.a(this.j, ((a)paramObject).j))) {
                    break label136;
                  }
                }
              }
            }
            return false;
          }
          label136:
          return true;
        }
        
        public final Uri f()
        {
          return this.g;
        }
        
        public final APa g()
        {
          return this.j;
        }
        
        public int hashCode()
        {
          Object localObject = this.d;
          int k = 0;
          int m;
          if (localObject != null) {
            m = ((Eka)localObject).hashCode();
          } else {
            m = 0;
          }
          localObject = this.e;
          int n;
          if (localObject != null) {
            n = localObject.hashCode();
          } else {
            n = 0;
          }
          int i1 = this.f;
          int i3 = i1;
          if (i1 != 0) {
            i3 = 1;
          }
          localObject = this.g;
          int i2;
          if (localObject != null) {
            i2 = ((Uri)localObject).hashCode();
          } else {
            i2 = 0;
          }
          localObject = this.h;
          int i4;
          if (localObject != null) {
            i4 = ((APa)localObject).hashCode();
          } else {
            i4 = 0;
          }
          int i5 = this.i;
          int i6 = i5;
          if (i5 != 0) {
            i6 = 1;
          }
          localObject = this.j;
          if (localObject != null) {
            k = ((APa)localObject).hashCode();
          }
          return (((((m * 31 + n) * 31 + i3) * 31 + i2) * 31 + i4) * 31 + i6) * 31 + k;
        }
        
        public String toString()
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("ContentAfter(f=");
          localStringBuilder.append(this.d);
          localStringBuilder.append(", sO=");
          localStringBuilder.append(this.e);
          localStringBuilder.append(", bI=");
          localStringBuilder.append(this.f);
          localStringBuilder.append(", imageUri=");
          localStringBuilder.append(this.g);
          localStringBuilder.append(", imageSize=");
          localStringBuilder.append(this.h);
          localStringBuilder.append(", hasBeforeState=");
          localStringBuilder.append(this.i);
          localStringBuilder.append(", viewSize=");
          localStringBuilder.append(this.j);
          localStringBuilder.append(")");
          return localStringBuilder.toString();
        }
      }
      
      public static final class b
        extends lxa.b.a
      {
        private final Eka d;
        private final lxa.d e;
        private final Bitmap f;
        private final APa g;
        private final Float h;
        
        public b(Eka paramEka, lxa.d paramd, Bitmap paramBitmap, APa paramAPa, Float paramFloat)
        {
          super(paramd, true, null);
          this.d = paramEka;
          this.e = paramd;
          this.f = paramBitmap;
          this.g = paramAPa;
          this.h = paramFloat;
        }
        
        public final Bitmap d()
        {
          return this.f;
        }
        
        public final Float e()
        {
          return this.h;
        }
        
        public boolean equals(Object paramObject)
        {
          if (this != paramObject) {
            if ((paramObject instanceof b))
            {
              paramObject = (b)paramObject;
              if ((oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(this.e, ((b)paramObject).e)) && (oXa.a(this.f, ((b)paramObject).f)) && (oXa.a(this.g, ((b)paramObject).g)) && (oXa.a(this.h, ((b)paramObject).h))) {}
            }
            else
            {
              return false;
            }
          }
          return true;
        }
        
        public final APa f()
        {
          return this.g;
        }
        
        public int hashCode()
        {
          Object localObject = this.d;
          int i = 0;
          int j;
          if (localObject != null) {
            j = ((Eka)localObject).hashCode();
          } else {
            j = 0;
          }
          localObject = this.e;
          int k;
          if (localObject != null) {
            k = localObject.hashCode();
          } else {
            k = 0;
          }
          localObject = this.f;
          int m;
          if (localObject != null) {
            m = localObject.hashCode();
          } else {
            m = 0;
          }
          localObject = this.g;
          int n;
          if (localObject != null) {
            n = ((APa)localObject).hashCode();
          } else {
            n = 0;
          }
          localObject = this.h;
          if (localObject != null) {
            i = ((Float)localObject).hashCode();
          }
          return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
        }
        
        public String toString()
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("ContentBefore(f=");
          localStringBuilder.append(this.d);
          localStringBuilder.append(", sO=");
          localStringBuilder.append(this.e);
          localStringBuilder.append(", bitmap=");
          localStringBuilder.append(this.f);
          localStringBuilder.append(", viewDimenRatio=");
          localStringBuilder.append(this.g);
          localStringBuilder.append(", progress=");
          localStringBuilder.append(this.h);
          localStringBuilder.append(")");
          return localStringBuilder.toString();
        }
      }
    }
    
    public static final class b
      extends lxa.b
    {
      private final float a;
      
      public b(float paramFloat)
      {
        super();
        this.a = paramFloat;
      }
      
      public final float a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if (Float.compare(this.a, ((b)paramObject).a) == 0) {}
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
        return Float.floatToIntBits(this.a);
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Loading(progress=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends lxa.b
    {
      private final c.a a;
      
      public c(c.a parama)
      {
        super();
        this.a = parama;
      }
      
      public final c.a a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if (oXa.a(this.a, ((c)paramObject).a)) {}
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
        c.a locala = this.a;
        int i;
        if (locala != null) {
          i = locala.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("NetworkError(error=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class c
  {
    private final int a;
    
    private c(int paramInt)
    {
      this.a = paramInt;
    }
    
    public final int a()
    {
      return this.a;
    }
    
    public static final class a
      extends lxa.c
    {
      private final String b;
      private final int c;
      
      public a(String paramString, int paramInt)
      {
        super(null);
        this.b = paramString;
        this.c = paramInt;
      }
      
      public final String b()
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
            if (oXa.a(this.b, ((a)paramObject).b))
            {
              int i;
              if (this.c == ((a)paramObject).c) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label58;
              }
            }
          }
          return false;
        }
        label58:
        return true;
      }
      
      public int hashCode()
      {
        String str = this.b;
        int i;
        if (str != null) {
          i = str.hashCode();
        } else {
          i = 0;
        }
        return i * 31 + this.c;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("ChangeSelected(newSelectedFilterId=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", cPos=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends lxa.c
    {
      private final List<Eka> b;
      private final String c;
      private final int d;
      
      public b(List<Eka> paramList, String paramString, int paramInt)
      {
        super(null);
        this.b = paramList;
        this.c = paramString;
        this.d = paramInt;
      }
      
      public final List<Eka> b()
      {
        return this.b;
      }
      
      public final String c()
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
            if ((oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c)))
            {
              int i;
              if (this.d == ((b)paramObject).d) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label72;
              }
            }
          }
          return false;
        }
        label72:
        return true;
      }
      
      public int hashCode()
      {
        Object localObject = this.b;
        int i = 0;
        int j;
        if (localObject != null) {
          j = localObject.hashCode();
        } else {
          j = 0;
        }
        localObject = this.c;
        if (localObject != null) {
          i = ((String)localObject).hashCode();
        }
        return (j * 31 + i) * 31 + this.d;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(items=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", selectedFilterId=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(", cPos=");
        localStringBuilder.append(this.d);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class d
  {
    public static final class a
      extends lxa.d
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends lxa.d
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends lxa.d
    {
      private final lka a;
      
      public c(lka paramlka)
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
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if (oXa.a(this.a, ((c)paramObject).a)) {}
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
        localStringBuilder.append("GoPro(editorFilter=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class d
      extends lxa.d
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
  }
  
  public static abstract class e
  {
    public static final class a
      extends lxa.e
    {
      private final Eka a;
      
      public a(Eka paramEka)
      {
        super();
        this.a = paramEka;
      }
      
      public final Eka a()
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
        Eka localEka = this.a;
        int i;
        if (localEka != null) {
          i = localEka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("FilterClicked(filter=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends lxa.e
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends lxa.e
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends lxa.e
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
    
    public static final class e
      extends lxa.e
    {
      public static final e a = new e();
      
      private e()
      {
        super();
      }
    }
    
    public static final class f
      extends lxa.e
    {
      public static final f a = new f();
      
      private f()
      {
        super();
      }
    }
    
    public static final class g
      extends lxa.e
    {
      public static final g a = new g();
      
      private g()
      {
        super();
      }
    }
    
    public static final class h
      extends lxa.e
    {
      public static final h a = new h();
      
      private h()
      {
        super();
      }
    }
    
    public static final class i
      extends lxa.e
    {
      public static final i a = new i();
      
      private i()
      {
        super();
      }
    }
    
    public static final class j
      extends lxa.e
    {
      private final Uri a;
      private final APa b;
      
      public j(Uri paramUri, APa paramAPa)
      {
        super();
        this.a = paramUri;
        this.b = paramAPa;
      }
      
      public final Uri a()
      {
        return this.a;
      }
      
      public final APa b()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof j))
          {
            paramObject = (j)paramObject;
            if ((oXa.a(this.a, ((j)paramObject).a)) && (oXa.a(this.b, ((j)paramObject).b))) {}
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
        if (localObject != null) {
          i = ((APa)localObject).hashCode();
        }
        return j * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("UpdateViewSize(imageUri=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", viewSize=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */