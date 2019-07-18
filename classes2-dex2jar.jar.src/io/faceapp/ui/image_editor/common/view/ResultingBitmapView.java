package io.faceapp.ui.image_editor.common.view;

import FVa;
import Mpa;
import QQa;
import UPa;
import _Va;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bXa;
import cWa;
import cXa;
import io.faceapp.ui.components.CircularProgressBar;
import io.faceapp.ui.components.ImageDisplay;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.c.a.m;
import io.faceapp.ui.misc.recycler.view.InPhotoErrorView;
import jHa;
import jHa.a;
import jRa;
import kRa;
import oXa;
import vka;
import xQa;

public final class ResultingBitmapView
  extends ConstraintLayout
{
  private final FVa<Object> A;
  private kRa B;
  private bXa<cWa> u = l.b;
  private cXa<? super Boolean, cWa> v = i.b;
  private View w;
  private CircularProgressBar x;
  private InPhotoErrorView y;
  private b z = b.a;
  
  public ResultingBitmapView(Context paramContext)
  {
    super(paramContext);
    FVa localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<Any>()");
    this.A = localFVa;
    b(paramContext, null);
  }
  
  public ResultingBitmapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    FVa localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<Any>()");
    this.A = localFVa;
    b(paramContext, paramAttributeSet);
  }
  
  public ResultingBitmapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    FVa localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<Any>()");
    this.A = localFVa;
    b(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, int paramInt)
  {
    Mpa.k.a(paramContext, paramInt);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    Context localContext = null;
    try
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, io.faceapp.l.ResultingBitmapView);
      if (paramContext != null)
      {
        localContext = paramContext;
        this.z = d(paramContext.getInt(0, 0));
      }
      return;
    }
    finally
    {
      if (localContext != null) {
        localContext.recycle();
      }
    }
  }
  
  private final void a(ResultingBitmapView.d.a parama)
  {
    parama = parama.a();
    if (parama != null) {
      this.A.a(parama);
    }
    parama = this.x;
    if (parama != null)
    {
      UPa.b(parama, 0L, 1, null);
      return;
    }
    oXa.b("progressView");
    throw null;
  }
  
  private final jHa b(c.a parama)
  {
    if (oXa.a(parama, c.a.h.a)) {
      parama = jHa.e.a();
    } else if (oXa.a(parama, c.a.m.a)) {
      parama = jHa.e.a(new k(this));
    } else {
      parama = jHa.e.c();
    }
    return parama;
  }
  
  private final void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    a(paramContext, paramAttributeSet);
    a(paramContext, 3);
    View.inflate(paramContext, this.z.a(), this);
  }
  
  private final b d(int paramInt)
  {
    b localb;
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        localb = b.c;
      } else {
        localb = b.b;
      }
    }
    else {
      localb = b.a;
    }
    return localb;
  }
  
  public final ResultingBitmapView a(bXa<cWa> parambXa)
  {
    oXa.b(parambXa, "retryFunc");
    this.u = parambXa;
    return this;
  }
  
  public final ResultingBitmapView a(cXa<? super Boolean, cWa> paramcXa)
  {
    oXa.b(paramcXa, "beforeAfterFunc");
    this.v = paramcXa;
    return this;
  }
  
  public final ResultingBitmapView a(jRa paramjRa)
  {
    oXa.b(paramjRa, "disposable");
    View localView = this.w;
    if (localView != null)
    {
      Object localObject = localView;
      if (!(localView instanceof a)) {
        localObject = null;
      }
      localObject = (a)localObject;
      if (localObject != null)
      {
        localObject = ((a)localObject).getBeforeAfterSub();
        if (localObject != null)
        {
          localObject = ((QQa)localObject).c(new m(this));
          if (localObject != null) {
            paramjRa.b((kRa)localObject);
          }
        }
      }
      paramjRa.b(this.A.e().c(new n(this)));
      return this;
    }
    oXa.b("contentView");
    throw null;
  }
  
  public final void a()
  {
    kRa localkRa = this.B;
    if (localkRa != null) {
      localkRa.i();
    }
    this.B = null;
  }
  
  public final void a(Matrix paramMatrix, vka paramvka)
  {
    oXa.b(paramvka, "primaryFace");
    View localView = this.w;
    if (localView != null)
    {
      Object localObject = localView;
      if (!(localView instanceof ScrollableContentView)) {
        localObject = null;
      }
      localObject = (ScrollableContentView)localObject;
      if (localObject != null) {
        ((ScrollableContentView)localObject).a(paramMatrix, paramvka);
      }
      return;
    }
    oXa.b("contentView");
    throw null;
  }
  
  public final void a(d paramd)
  {
    oXa.b(paramd, "model");
    Object localObject = this.B;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    localObject = this.y;
    if (localObject != null)
    {
      boolean bool = paramd instanceof ResultingBitmapView.d.b;
      UPa.a((View)localObject, bool);
      if ((paramd instanceof ResultingBitmapView.d.a))
      {
        localObject = this.x;
        if (localObject != null)
        {
          if (((CircularProgressBar)localObject).getProgress() < 0.1F)
          {
            a((ResultingBitmapView.d.a)paramd);
          }
          else
          {
            localObject = this.x;
            if (localObject != null)
            {
              if (((CircularProgressBar)localObject).getAfterAnimProgress() < 1.0F)
              {
                localObject = this.x;
                if (localObject != null)
                {
                  ((CircularProgressBar)localObject).setProgress(1.0F);
                }
                else
                {
                  oXa.b("progressView");
                  throw null;
                }
              }
              localObject = this.x;
              if (localObject != null)
              {
                this.B = ((CircularProgressBar)localObject).a().b(new j(this, paramd));
              }
              else
              {
                oXa.b("progressView");
                throw null;
              }
            }
            else
            {
              oXa.b("progressView");
              throw null;
            }
          }
        }
        else
        {
          oXa.b("progressView");
          throw null;
        }
      }
      else if ((paramd instanceof ResultingBitmapView.d.c))
      {
        paramd = (ResultingBitmapView.d.c)paramd;
        localObject = paramd.a();
        if (localObject != null) {
          this.A.a(localObject);
        }
        localObject = this.x;
        if (localObject != null)
        {
          float f = paramd.b();
          CircularProgressBar localCircularProgressBar = this.x;
          if (localCircularProgressBar != null)
          {
            if (f > localCircularProgressBar.getProgress()) {
              bool = true;
            } else {
              bool = false;
            }
            ((CircularProgressBar)localObject).setAnimateProgress(bool);
            localObject = this.x;
            if (localObject != null)
            {
              ((CircularProgressBar)localObject).setProgress(paramd.b());
              paramd = this.x;
              if (paramd != null)
              {
                UPa.c(paramd, 0L, 1, null);
              }
              else
              {
                oXa.b("progressView");
                throw null;
              }
            }
            else
            {
              oXa.b("progressView");
              throw null;
            }
          }
          else
          {
            oXa.b("progressView");
            throw null;
          }
        }
        else
        {
          oXa.b("progressView");
          throw null;
        }
      }
      else if (bool)
      {
        localObject = this.y;
        if (localObject != null)
        {
          ((InPhotoErrorView)localObject).a(b(((ResultingBitmapView.d.b)paramd).a()));
          paramd = this.x;
          if (paramd != null)
          {
            UPa.b(paramd, 0L, 1, null);
          }
          else
          {
            oXa.b("progressView");
            throw null;
          }
        }
        else
        {
          oXa.b("netErrorView");
          throw null;
        }
      }
      return;
    }
    oXa.b("netErrorView");
    throw null;
  }
  
  public final <VIEWTYPE extends c> VIEWTYPE getContentView()
  {
    View localView = this.w;
    if (localView != null)
    {
      if (localView != null) {
        return (c)localView;
      }
      throw new _Va("null cannot be cast to non-null type VIEWTYPE");
    }
    oXa.b("contentView");
    throw null;
  }
  
  public final QQa<Matrix> getMatrixChangedObs()
  {
    Object localObject1 = this.w;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      Object localObject3 = localObject1;
      if (!(localObject1 instanceof ImageDisplay)) {
        localObject3 = null;
      }
      localObject1 = (ImageDisplay)localObject3;
      localObject3 = localObject2;
      if (localObject1 != null) {
        localObject3 = ((ImageDisplay)localObject1).getMatrixChanged();
      }
      return (QQa<Matrix>)localObject3;
    }
    oXa.b("contentView");
    throw null;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    View localView = findViewById(2131296456);
    if (localView != null)
    {
      this.w = localView;
      localView = findViewById(2131296763);
      if (localView != null)
      {
        this.x = ((CircularProgressBar)localView);
        localView = findViewById(2131296544);
        if (localView != null)
        {
          this.y = ((InPhotoErrorView)localView);
          return;
        }
        oXa.a();
        throw null;
      }
      oXa.a();
      throw null;
    }
    oXa.a();
    throw null;
  }
  
  public static abstract interface a
  {
    public abstract QQa<Boolean> getBeforeAfterSub();
  }
  
  public static enum b
  {
    private final int e;
    
    static
    {
      b localb1 = new b("SCROLLABLE", 0, 2131493126);
      a = localb1;
      b localb2 = new b("COMBINED", 1, 2131493124);
      b = localb2;
      b localb3 = new b("CROP", 2, 2131493125);
      c = localb3;
      d = new b[] { localb1, localb2, localb3 };
    }
    
    private b(int paramInt)
    {
      this.e = paramInt;
    }
    
    public final int a()
    {
      return this.e;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(Object paramObject);
  }
  
  public static abstract class d
  {
    public static final class a
      extends ResultingBitmapView.d
    {
      private final Object a;
      
      public a(Object paramObject)
      {
        super();
        this.a = paramObject;
      }
      
      public final Object a()
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
        Object localObject = this.a;
        int i;
        if (localObject != null) {
          i = localObject.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(content=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends ResultingBitmapView.d
    {
      private final c.a a;
      
      public b(c.a parama)
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
    
    public static final class c
      extends ResultingBitmapView.d
    {
      private final Object a;
      private final float b;
      
      public c(Object paramObject, float paramFloat)
      {
        super();
        this.a = paramObject;
        this.b = paramFloat;
      }
      
      public final Object a()
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
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if ((oXa.a(this.a, ((c)paramObject).a)) && (Float.compare(this.b, ((c)paramObject).b) == 0)) {}
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
        int i;
        if (localObject != null) {
          i = localObject.hashCode();
        } else {
          i = 0;
        }
        return i * 31 + Float.floatToIntBits(this.b);
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Progress(content=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", progress=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/ResultingBitmapView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */