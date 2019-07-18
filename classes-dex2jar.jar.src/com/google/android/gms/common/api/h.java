package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.t;

public final class h
{
  public static g<Status> a(Status paramStatus, f paramf)
  {
    t.a(paramStatus, "Result must not be null");
    paramf = new n(paramf);
    paramf.a(paramStatus);
    return paramf;
  }
  
  public static <R extends l> g<R> a(R paramR, f paramf)
  {
    t.a(paramR, "Result must not be null");
    t.a(paramR.w().B() ^ true, "Status code must not be SUCCESS");
    paramf = new a(paramf, paramR);
    paramf.a(paramR);
    return paramf;
  }
  
  private static final class a<R extends l>
    extends BasePendingResult<R>
  {
    private final R q;
    
    public a(f paramf, R paramR)
    {
      super();
      this.q = paramR;
    }
    
    protected final R a(Status paramStatus)
    {
      return this.q;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */