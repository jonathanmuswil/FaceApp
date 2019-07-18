package com.google.firebase.components;

import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class e<T>
{
  private final Set<Class<? super T>> a;
  private final Set<q> b;
  private final int c;
  private final int d;
  private final i<T> e;
  private final Set<Class<?>> f;
  
  private e(Set<Class<? super T>> paramSet, Set<q> paramSet1, int paramInt1, int paramInt2, i<T> parami, Set<Class<?>> paramSet2)
  {
    this.a = Collections.unmodifiableSet(paramSet);
    this.b = Collections.unmodifiableSet(paramSet1);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = parami;
    this.f = Collections.unmodifiableSet(paramSet2);
  }
  
  public static <T> a<T> a(Class<T> paramClass)
  {
    return new a(paramClass, new Class[0], null);
  }
  
  @SafeVarargs
  public static <T> a<T> a(Class<T> paramClass, Class<? super T>... paramVarArgs)
  {
    return new a(paramClass, paramVarArgs, null);
  }
  
  public static <T> e<T> a(T paramT, Class<T> paramClass)
  {
    paramClass = b(paramClass);
    paramClass.a(c.a(paramT));
    return paramClass.b();
  }
  
  @SafeVarargs
  public static <T> e<T> a(T paramT, Class<T> paramClass, Class<? super T>... paramVarArgs)
  {
    paramClass = a(paramClass, paramVarArgs);
    paramClass.a(b.a(paramT));
    return paramClass.b();
  }
  
  public static <T> a<T> b(Class<T> paramClass)
  {
    paramClass = a(paramClass);
    a.a(paramClass);
    return paramClass;
  }
  
  public Set<q> a()
  {
    return this.b;
  }
  
  public i<T> b()
  {
    return this.e;
  }
  
  public Set<Class<? super T>> c()
  {
    return this.a;
  }
  
  public Set<Class<?>> d()
  {
    return this.f;
  }
  
  public boolean e()
  {
    int i = this.c;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean f()
  {
    boolean bool;
    if (this.c == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g()
  {
    boolean bool;
    if (this.d == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Component<");
    localStringBuilder.append(Arrays.toString(this.a.toArray()));
    localStringBuilder.append(">{");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", type=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", deps=");
    localStringBuilder.append(Arrays.toString(this.b.toArray()));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static class a<T>
  {
    private final Set<Class<? super T>> a = new HashSet();
    private final Set<q> b = new HashSet();
    private int c;
    private int d;
    private i<T> e;
    private Set<Class<?>> f;
    
    @SafeVarargs
    private a(Class<T> paramClass, Class<? super T>... paramVarArgs)
    {
      int i = 0;
      this.c = 0;
      this.d = 0;
      this.f = new HashSet();
      t.a(paramClass, "Null interface");
      this.a.add(paramClass);
      int j = paramVarArgs.length;
      while (i < j)
      {
        t.a(paramVarArgs[i], "Null interface");
        i++;
      }
      Collections.addAll(this.a, paramVarArgs);
    }
    
    private a<T> a(int paramInt)
    {
      boolean bool;
      if (this.c == 0) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool, "Instantiation type has already been set.");
      this.c = paramInt;
      return this;
    }
    
    private void a(Class<?> paramClass)
    {
      t.a(this.a.contains(paramClass) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
    }
    
    private a<T> d()
    {
      this.d = 1;
      return this;
    }
    
    public a<T> a()
    {
      a(1);
      return this;
    }
    
    public a<T> a(i<T> parami)
    {
      t.a(parami, "Null factory");
      this.e = ((i)parami);
      return this;
    }
    
    public a<T> a(q paramq)
    {
      t.a(paramq, "Null dependency");
      a(paramq.a());
      this.b.add(paramq);
      return this;
    }
    
    public e<T> b()
    {
      boolean bool;
      if (this.e != null) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool, "Missing required property: factory.");
      return new e(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f, null);
    }
    
    public a<T> c()
    {
      a(2);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */