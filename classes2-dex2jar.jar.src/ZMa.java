import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface zMa
  extends sla, jta<zMa.d>, c
{
  public abstract QQa<Boolean> K();
  
  public abstract void a(String paramString, Rka paramRka);
  
  public abstract void b(String paramString);
  
  public abstract void e(boolean paramBoolean);
  
  public abstract QQa<zMa.c> getViewActions();
  
  public abstract void o();
  
  public static final class a
  {
    public static void a(zMa paramzMa, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      paramzMa.a(new zMa.d.d(parama));
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends zMa.b
    {
      private final String a;
      
      public a(String paramString)
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
        localStringBuilder.append("ShowSinglePoll(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends zMa.b
    {
      private final String a;
      
      public b(String paramString)
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
        localStringBuilder.append("ShowVoting(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends zMa.c
    {
      private final String a;
      
      public a(String paramString)
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
        localStringBuilder.append("PollDeleted(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends zMa.c
    {
      private final String a;
      private final Rka b;
      
      public b(String paramString, Rka paramRka)
      {
        super();
        this.a = paramString;
        this.b = paramRka;
      }
      
      public final Rka a()
      {
        return this.b;
      }
      
      public final String b()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b))) {}
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
          j = ((String)localObject).hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        if (localObject != null) {
          i = ((Rka)localObject).hashCode();
        }
        return j * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PollVoted(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", newVote=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends zMa.c
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends zMa.c
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
  }
  
  public static abstract class d
  {
    public static final class a
      extends zMa.d
    {
      private final List<Yka> a;
      private final List<Yka> b;
      private final boolean c;
      
      public a(List<? extends Yka> paramList1, List<? extends Yka> paramList2, boolean paramBoolean)
      {
        super();
        this.a = paramList1;
        this.b = paramList2;
        this.c = paramBoolean;
      }
      
      public final boolean a()
      {
        return this.c;
      }
      
      public final List<Yka> b()
      {
        return this.a;
      }
      
      public final List<Yka> c()
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
            if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)))
            {
              int i;
              if (this.c == ((a)paramObject).c) {
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
        List localList = this.a;
        int i = 0;
        int j;
        if (localList != null) {
          j = localList.hashCode();
        } else {
          j = 0;
        }
        localList = this.b;
        if (localList != null) {
          i = localList.hashCode();
        }
        int k = this.c;
        int m = k;
        if (k != 0) {
          m = 1;
        }
        return (j * 31 + i) * 31 + m;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(newUpdates=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", oldUpdates=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", afterRefresh=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends zMa.d
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends zMa.d
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends zMa.d
    {
      private final c.a a;
      
      public d(c.a parama)
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */