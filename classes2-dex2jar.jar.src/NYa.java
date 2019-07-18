import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import io.faceapp.ui.misc.e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class nya
{
  private static final Faa.a a(e.a parama)
  {
    int i = mya.a[parama.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        parama = Faa.a.b;
      } else {
        throw new UVa();
      }
    }
    else {
      parama = Faa.a.a;
    }
    return parama;
  }
  
  private static final Faa.d.d a(RectF paramRectF)
  {
    Faa.d.d.a locala = Faa.d.d.l();
    locala.a(b(paramRectF));
    paramRectF = locala.build();
    oXa.a(paramRectF, "PhotoTransformation.Crop…tangle(cropRect)).build()");
    return (Faa.d.d)paramRectF;
  }
  
  private static final Faa.d a(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).a(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final Faa.d a(String paramString)
  {
    Faa.d.a locala = Faa.d.l();
    Faa.d.g.a locala1 = Faa.d.g.l();
    locala1.a(paramString);
    locala.a((Faa.d.g)locala1.build());
    paramString = locala.build();
    oXa.a(paramString, "PhotoTransformation.newB…erId(id).build()).build()");
    return (Faa.d)paramString;
  }
  
  private static final Faa.d a(String paramString, float paramFloat)
  {
    Faa.d.a locala = Faa.d.l();
    locala.a(b(paramString, paramFloat));
    paramString = locala.build();
    oXa.a(paramString, "PhotoTransformation.newB…gTool(id, value)).build()");
    return (Faa.d)paramString;
  }
  
  public static final Faa a(e.a parama, Bundle paramBundle)
  {
    oXa.b(parama, "action");
    oXa.b(paramBundle, "config");
    Faa.c localc = Faa.l();
    oXa.a(localc, "builder");
    localc.a(Faa.b.a);
    localc.a("3.4.8");
    localc.a(a(parama));
    parama = oya.s(oya.d(paramBundle)).iterator();
    while (parama.hasNext()) {
      localc.a(a((String)parama.next()));
    }
    parama = EPa.b(oya.p(oya.u(paramBundle)));
    if (parama != null) {
      localc.a(d(parama, oya.a(oya.u(paramBundle), pya.m.i)));
    }
    parama = EPa.b(oya.e(oya.a(paramBundle)));
    if (parama != null) {
      localc.a(a(parama, oya.a(oya.a(paramBundle), pya.a.i)));
    }
    parama = EPa.b(oya.j(oya.c(paramBundle)));
    if (parama != null) {
      localc.a(c(parama, oya.a(oya.c(paramBundle), pya.g.i)));
    }
    parama = oya.b(oya.v(paramBundle), pya.c.i);
    if (parama != null) {
      localc.a(b(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.b.i);
    if (parama != null) {
      localc.a(a(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.k.i);
    if (parama != null) {
      localc.a(f(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.n.i);
    if (parama != null) {
      localc.a(h(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.l.i);
    if (parama != null) {
      localc.a(g(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.i.i);
    if (parama != null) {
      localc.a(e(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.o.i);
    if (parama != null) {
      localc.a(i(parama.floatValue()));
    }
    parama = oya.b(oya.v(paramBundle), pya.h.i);
    if (parama != null) {
      localc.a(d(parama.floatValue()));
    }
    parama = oya.h(oya.v(paramBundle));
    if (parama != null) {
      localc.a(c(parama));
    }
    parama = localc.build();
    oXa.a(parama, "builder.build()");
    return (Faa)parama;
  }
  
  private static final String a(Bundle paramBundle)
  {
    Object localObject = mWa.b(new pya[] { pya.b.i, pya.c.i, pya.k.i, pya.n.i, pya.i.i, pya.l.i });
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      pya localpya = (pya)localIterator.next();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(localpya.h());
      ((StringBuilder)localObject).append(':');
      ((StringBuilder)localObject).append(oya.a(oya.v(paramBundle), localpya));
      localArrayList.add(((StringBuilder)localObject).toString());
    }
    return mWa.a(localArrayList, null, "[", "]", 0, null, null, 57, null);
  }
  
  public static final Map<String, String> a(Eda paramEda, Bundle paramBundle)
  {
    oXa.b(paramEda, "photoOp");
    oXa.b(paramBundle, "config");
    HashMap localHashMap = new HashMap();
    localHashMap.put("photo_code", paramEda.f());
    localHashMap.put("original_width", String.valueOf(paramEda.e().a().c()));
    localHashMap.put("original_height", String.valueOf(paramEda.e().a().b()));
    localHashMap.put("width", String.valueOf(paramEda.d().a().c()));
    localHashMap.put("height", String.valueOf(paramEda.d().a().b()));
    localHashMap.put("gender", paramEda.b().m().getId());
    localHashMap.put("adjustments", a(paramBundle));
    Object localObject1 = EPa.b(mWa.a(oya.s(oya.d(paramBundle)), null, null, null, 0, null, null, 63, null));
    if (localObject1 != null) {
      localObject1 = (String)localHashMap.put("filters", localObject1);
    }
    Object localObject2 = EPa.b(oya.e(oya.a(paramBundle)));
    if (localObject2 != null)
    {
      f = oya.a(oya.a(paramBundle), pya.a.i);
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(';');
      ((StringBuilder)localObject1).append(f);
      localObject1 = (String)localHashMap.put("background", ((StringBuilder)localObject1).toString());
    }
    localObject2 = EPa.b(oya.p(oya.u(paramBundle)));
    if (localObject2 != null)
    {
      f = oya.a(oya.u(paramBundle), pya.m.i);
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(';');
      ((StringBuilder)localObject1).append(f);
      localObject1 = (String)localHashMap.put("tattoo", ((StringBuilder)localObject1).toString());
    }
    localObject1 = EPa.b(oya.j(oya.c(paramBundle)));
    if (localObject1 != null)
    {
      f = oya.a(oya.c(paramBundle), pya.g.i);
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(';');
      ((StringBuilder)localObject2).append(f);
      localObject1 = (String)localHashMap.put("effect", ((StringBuilder)localObject2).toString());
    }
    localObject1 = Float.valueOf(oya.a(oya.v(paramBundle), pya.h.i));
    float f = ((Float)localObject1).floatValue();
    int i = 1;
    int j;
    if (f > 0.0F) {
      j = 1;
    } else {
      j = 0;
    }
    if (j == 0) {
      localObject1 = null;
    }
    if (localObject1 != null) {
      localObject1 = (String)localHashMap.put("lens_blur", String.valueOf(((Float)localObject1).floatValue()));
    }
    localObject1 = Float.valueOf(oya.a(oya.v(paramBundle), pya.o.i));
    if (Math.abs(((Float)localObject1).floatValue()) > 0.0F) {
      j = i;
    } else {
      j = 0;
    }
    if (j == 0) {
      localObject1 = null;
    }
    if (localObject1 != null) {
      localObject1 = (String)localHashMap.put("vignette", String.valueOf(((Float)localObject1).floatValue()));
    }
    paramBundle = oya.h(oya.v(paramBundle));
    if (paramBundle != null)
    {
      paramBundle = oya.a(paramBundle, paramEda.d().a());
      paramEda = new StringBuilder();
      paramEda.append('[');
      paramEda.append(paramBundle.left);
      paramEda.append(',');
      paramEda.append(paramBundle.top);
      paramEda.append(',');
      paramEda.append(paramBundle.width());
      paramEda.append(',');
      paramEda.append(paramBundle.height());
      paramEda.append(']');
      paramEda = (String)localHashMap.put("crop", paramEda.toString());
    }
    return localHashMap;
  }
  
  private static final Faa.d.b b(String paramString, float paramFloat)
  {
    Faa.d.b.a locala = Faa.d.b.l();
    locala.a(paramString);
    locala.a(paramFloat);
    paramString = locala.build();
    oXa.a(paramString, "PhotoTransformation.Cata…erPosition(value).build()");
    return (Faa.d.b)paramString;
  }
  
  private static final Faa.d b(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).b(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final oZ b(RectF paramRectF)
  {
    oZ.a locala = oZ.p();
    locala.b(paramRectF.left);
    locala.c(paramRectF.right);
    locala.d(paramRectF.top);
    locala.a(paramRectF.bottom);
    paramRectF = locala.build();
    oXa.a(paramRectF, "Proto.FRectangle.newBuil…Rect.bottom)\n    .build()");
    return (oZ)paramRectF;
  }
  
  private static final Faa.d.i c(float paramFloat)
  {
    Object localObject = Faa.d.i.k();
    ((Faa.d.i.a)localObject).a(paramFloat);
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.Simp…erPosition(value).build()");
    return (Faa.d.i)localObject;
  }
  
  private static final Faa.d c(RectF paramRectF)
  {
    Faa.d.a locala = Faa.d.l();
    locala.a(a(paramRectF));
    paramRectF = locala.build();
    oXa.a(paramRectF, "PhotoTransformation.newB…opTool(cropRect)).build()");
    return (Faa.d)paramRectF;
  }
  
  private static final Faa.d c(String paramString, float paramFloat)
  {
    Faa.d.a locala = Faa.d.l();
    locala.b(b(paramString, paramFloat));
    paramString = locala.build();
    oXa.a(paramString, "PhotoTransformation.newB…gTool(id, value)).build()");
    return (Faa.d)paramString;
  }
  
  private static final Faa.d d(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).d(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final Faa.d d(String paramString, float paramFloat)
  {
    Faa.d.a locala = Faa.d.l();
    locala.c(b(paramString, paramFloat));
    paramString = locala.build();
    oXa.a(paramString, "PhotoTransformation.newB…gTool(id, value)).build()");
    return (Faa.d)paramString;
  }
  
  private static final Faa.d e(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).c(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final Faa.d f(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).e(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final Faa.d g(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).f(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final Faa.d h(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).g(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
  
  private static final Faa.d i(float paramFloat)
  {
    Object localObject = Faa.d.l();
    ((Faa.d.a)localObject).h(c(paramFloat));
    localObject = ((PT.a)localObject).build();
    oXa.a(localObject, "PhotoTransformation.newB…impleTool(value)).build()");
    return (Faa.d)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */