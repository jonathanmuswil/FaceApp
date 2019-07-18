package com.google.android.gms.common.internal;

import QO;
import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import id;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d
{
  private final Account a;
  private final Set<Scope> b;
  private final Set<Scope> c;
  private final Map<a<?>, b> d;
  private final int e;
  private final View f;
  private final String g;
  private final String h;
  private final QO i;
  private Integer j;
  
  public d(Account paramAccount, Set<Scope> paramSet, Map<a<?>, b> paramMap, int paramInt, View paramView, String paramString1, String paramString2, QO paramQO)
  {
    this.a = paramAccount;
    if (paramSet == null) {
      paramAccount = Collections.EMPTY_SET;
    } else {
      paramAccount = Collections.unmodifiableSet(paramSet);
    }
    this.b = paramAccount;
    paramAccount = paramMap;
    if (paramMap == null) {
      paramAccount = Collections.EMPTY_MAP;
    }
    this.d = paramAccount;
    this.f = paramView;
    this.e = paramInt;
    this.g = paramString1;
    this.h = paramString2;
    this.i = paramQO;
    paramSet = new HashSet(this.b);
    paramAccount = this.d.values().iterator();
    while (paramAccount.hasNext()) {
      paramSet.addAll(((b)paramAccount.next()).a);
    }
    this.c = Collections.unmodifiableSet(paramSet);
  }
  
  public final Account a()
  {
    return this.a;
  }
  
  public final Set<Scope> a(a<?> parama)
  {
    b localb = (b)this.d.get(parama);
    if ((localb != null) && (!localb.a.isEmpty()))
    {
      parama = new HashSet(this.b);
      parama.addAll(localb.a);
      return parama;
    }
    return this.b;
  }
  
  public final void a(Integer paramInteger)
  {
    this.j = paramInteger;
  }
  
  @Deprecated
  public final String b()
  {
    Account localAccount = this.a;
    if (localAccount != null) {
      return localAccount.name;
    }
    return null;
  }
  
  public final Account c()
  {
    Account localAccount = this.a;
    if (localAccount != null) {
      return localAccount;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  public final Set<Scope> d()
  {
    return this.c;
  }
  
  public final Integer e()
  {
    return this.j;
  }
  
  public final Map<a<?>, b> f()
  {
    return this.d;
  }
  
  public final String g()
  {
    return this.h;
  }
  
  public final String h()
  {
    return this.g;
  }
  
  public final Set<Scope> i()
  {
    return this.b;
  }
  
  public final QO j()
  {
    return this.i;
  }
  
  public static final class a
  {
    private Account a;
    private id<Scope> b;
    private Map<a<?>, d.b> c;
    private int d = 0;
    private View e;
    private String f;
    private String g;
    private QO h = QO.a;
    
    public final a a(Account paramAccount)
    {
      this.a = paramAccount;
      return this;
    }
    
    public final a a(String paramString)
    {
      this.g = paramString;
      return this;
    }
    
    public final a a(Collection<Scope> paramCollection)
    {
      if (this.b == null) {
        this.b = new id();
      }
      this.b.addAll(paramCollection);
      return this;
    }
    
    public final d a()
    {
      return new d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public final a b(String paramString)
    {
      this.f = paramString;
      return this;
    }
  }
  
  public static final class b
  {
    public final Set<Scope> a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */