import android.content.Context;
import java.util.List;
import java.util.NoSuchElementException;

public abstract interface pIa
  extends sla, jta<pIa.c>
{
  public abstract void O();
  
  public abstract void U();
  
  public abstract void a(JDa paramJDa);
  
  public abstract void a(Rva.a parama);
  
  public abstract void dismiss();
  
  public abstract QQa<pIa.b> getViewActions();
  
  public abstract Context h();
  
  public abstract void h(boolean paramBoolean);
  
  public abstract void i();
  
  public abstract void k();
  
  public static enum a
  {
    public static final pIa.a.a e = new pIa.a.a(null);
    private final String f;
    
    static
    {
      a locala1 = new a("EDITOR", 0, "fr_image_editor");
      a = locala1;
      a locala2 = new a("FUN", 1, "fr_fun");
      b = locala2;
      a locala3 = new a("LAYOUTS", 2, "fr_layouts");
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    private a(String paramString)
    {
      this.f = paramString;
    }
    
    public final String a()
    {
      return this.f;
    }
    
    public static final class a
    {
      public final pIa.a a(String paramString)
      {
        oXa.b(paramString, "tag");
        for (pIa.a locala : pIa.a.values()) {
          if (oXa.a(locala.a(), paramString)) {
            return locala;
          }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
      }
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends pIa.b
    {
      private final XDa.a a;
      
      public a(XDa.a parama)
      {
        super();
        this.a = parama;
      }
      
      public final XDa.a a()
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
        XDa.a locala = this.a;
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
        localStringBuilder.append("AddToLayouts(request=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends pIa.b
    {
      private final boolean a;
      
      public b(boolean paramBoolean)
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
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            int i;
            if (this.a == ((b)paramObject).a) {
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
        localStringBuilder.append("AuthFinished(success=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends pIa.b
    {
      private final Rva.a a;
      
      public c(Rva.a parama)
      {
        super();
        this.a = parama;
      }
      
      public final Rva.a a()
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
        Rva.a locala = this.a;
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
        localStringBuilder.append("CreatePollRequested(initialData=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class d
      extends pIa.b
    {
      private final boolean a;
      
      public d(boolean paramBoolean)
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
          if ((paramObject instanceof d))
          {
            paramObject = (d)paramObject;
            int i;
            if (this.a == ((d)paramObject).a) {
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
        localStringBuilder.append("Dismiss(confirmed=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class e
      extends pIa.b
    {
      private final KDa a;
      
      public e(KDa paramKDa)
      {
        super();
        this.a = paramKDa;
      }
      
      public final KDa a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof e))
          {
            paramObject = (e)paramObject;
            if (oXa.a(this.a, ((e)paramObject).a)) {}
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
        KDa localKDa = this.a;
        int i;
        if (localKDa != null) {
          i = localKDa.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("LayoutsAddPhoto(target=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class f
      extends pIa.b
    {
      private final KDa a;
      private final Eda b;
      private final yka c;
      
      public f(KDa paramKDa, Eda paramEda, yka paramyka)
      {
        super();
        this.a = paramKDa;
        this.b = paramEda;
        this.c = paramyka;
      }
      
      public final yka a()
      {
        return this.c;
      }
      
      public final Eda b()
      {
        return this.b;
      }
      
      public final KDa c()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof f))
          {
            paramObject = (f)paramObject;
            if ((oXa.a(this.a, ((f)paramObject).a)) && (oXa.a(this.b, ((f)paramObject).b)) && (oXa.a(this.c, ((f)paramObject).c))) {}
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
          j = localObject.hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        int k;
        if (localObject != null) {
          k = ((Eda)localObject).hashCode();
        } else {
          k = 0;
        }
        localObject = this.c;
        if (localObject != null) {
          i = ((yka)localObject).hashCode();
        }
        return (j * 31 + k) * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("LayoutsFilterSelected(target=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", photoOp=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", filter=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class g
      extends pIa.b
    {
      private final JDa a;
      
      public g(JDa paramJDa)
      {
        super();
        this.a = paramJDa;
      }
      
      public final JDa a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof g))
          {
            paramObject = (g)paramObject;
            if (oXa.a(this.a, ((g)paramObject).a)) {}
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
        JDa localJDa = this.a;
        int i;
        if (localJDa != null) {
          i = localJDa.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("LayoutsFilterSelectorRequested(request=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class h
      extends pIa.b
    {
      private final Rja a;
      
      public h(Rja paramRja)
      {
        super();
        this.a = paramRja;
      }
      
      public final Rja a()
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
        Rja localRja = this.a;
        int i;
        if (localRja != null) {
          i = localRja.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("LayoutsNewPhotoSelected(imageDesc=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class i
      extends pIa.b
    {
      public static final i a = new i();
      
      private i()
      {
        super();
      }
    }
    
    public static final class j
      extends pIa.b
    {
      public static final j a = new j();
      
      private j()
      {
        super();
      }
    }
    
    public static final class k
      extends pIa.b
    {
      private final String a;
      
      public k(String paramString)
      {
        super();
        this.a = paramString;
      }
      
      public final String a()
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
        String str = this.a;
        int i;
        if (str != null) {
          i = str.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("OpenProScreen(from=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class l
      extends pIa.b
    {
      private final Eda a;
      
      public l(Eda paramEda)
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
          if ((paramObject instanceof l))
          {
            paramObject = (l)paramObject;
            if (oXa.a(this.a, ((l)paramObject).a)) {}
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
        localStringBuilder.append("PhotoUploaded(uploadedPhotoOp=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class m
      extends pIa.b
    {
      private final List<List<String>> a;
      
      public m(List<? extends List<String>> paramList)
      {
        super();
        this.a = paramList;
      }
      
      public final List<List<String>> a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof m))
          {
            paramObject = (m)paramObject;
            if (oXa.a(this.a, ((m)paramObject).a)) {}
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
        List localList = this.a;
        int i;
        if (localList != null) {
          i = localList.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PollCreated(filterIds=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class n
      extends pIa.b
    {
      private final pIa.a a;
      
      public n(pIa.a parama)
      {
        super();
        this.a = parama;
      }
      
      public final pIa.a a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof n))
          {
            paramObject = (n)paramObject;
            if (oXa.a(this.a, ((n)paramObject).a)) {}
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
        pIa.a locala = this.a;
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
        localStringBuilder.append("SwitchToMode(newMode=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends pIa.c
    {
      private final pIa.a a;
      private final rIa<?> b;
      private final String c;
      
      public a(pIa.a parama, rIa<?> paramrIa, String paramString)
      {
        super();
        this.a = parama;
        this.b = paramrIa;
        this.c = paramString;
      }
      
      public final String a()
      {
        return this.c;
      }
      
      public final pIa.a b()
      {
        return this.a;
      }
      
      public final rIa<?> c()
      {
        return this.b;
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
          j = ((Enum)localObject).hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        int k;
        if (localObject != null) {
          k = localObject.hashCode();
        } else {
          k = 0;
        }
        localObject = this.c;
        if (localObject != null) {
          i = ((String)localObject).hashCode();
        }
        return (j * 31 + k) * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(mode=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", modePresenter=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", deviceId=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends pIa.c
    {
      private final Rja a;
      private final pIa.a b;
      private final String c;
      
      public b(Rja paramRja, pIa.a parama, String paramString)
      {
        super();
        this.a = paramRja;
        this.b = parama;
        this.c = paramString;
      }
      
      public final Rja a()
      {
        return this.a;
      }
      
      public final String b()
      {
        return this.c;
      }
      
      public final pIa.a c()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c))) {}
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
          j = localObject.hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        int k;
        if (localObject != null) {
          k = ((Enum)localObject).hashCode();
        } else {
          k = 0;
        }
        localObject = this.c;
        if (localObject != null) {
          i = ((String)localObject).hashCode();
        }
        return (j * 31 + k) * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Uploading(imageDesc=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", startMode=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", payload=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */