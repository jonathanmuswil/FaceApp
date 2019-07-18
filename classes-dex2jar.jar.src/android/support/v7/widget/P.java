package android.support.v7.widget;

import Gd;
import Id;
import Kd;
import Na;
import Ua;
import Vd;
import Xd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.c;
import android.support.v4.graphics.drawable.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import gd;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import md;
import nd;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import sc;
import ud;
import vd;

public final class p
{
  private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  private static p b;
  private static final c c = new c(6);
  private static final int[] d = { Kd.abc_textfield_search_default_mtrl_alpha, Kd.abc_textfield_default_mtrl_alpha, Kd.abc_ab_share_pack_mtrl_alpha };
  private static final int[] e = { Kd.abc_ic_commit_search_api_mtrl_alpha, Kd.abc_seekbar_tick_mark_material, Kd.abc_ic_menu_share_mtrl_alpha, Kd.abc_ic_menu_copy_mtrl_am_alpha, Kd.abc_ic_menu_cut_mtrl_alpha, Kd.abc_ic_menu_selectall_mtrl_alpha, Kd.abc_ic_menu_paste_mtrl_am_alpha };
  private static final int[] f = { Kd.abc_textfield_activated_mtrl_alpha, Kd.abc_textfield_search_activated_mtrl_alpha, Kd.abc_cab_background_top_mtrl_alpha, Kd.abc_text_cursor_material, Kd.abc_text_select_handle_left_mtrl_dark, Kd.abc_text_select_handle_middle_mtrl_dark, Kd.abc_text_select_handle_right_mtrl_dark, Kd.abc_text_select_handle_left_mtrl_light, Kd.abc_text_select_handle_middle_mtrl_light, Kd.abc_text_select_handle_right_mtrl_light };
  private static final int[] g = { Kd.abc_popup_background_mtrl_mult, Kd.abc_cab_background_internal_bg, Kd.abc_menu_hardkey_panel_mtrl_mult };
  private static final int[] h = { Kd.abc_tab_indicator_material, Kd.abc_textfield_search_material };
  private static final int[] i = { Kd.abc_btn_check_material, Kd.abc_btn_radio_material };
  private WeakHashMap<Context, vd<ColorStateList>> j;
  private gd<String, d> k;
  private vd<String> l;
  private final WeakHashMap<Context, md<WeakReference<Drawable.ConstantState>>> m = new WeakHashMap(0);
  private TypedValue n;
  private boolean o;
  
  private static long a(TypedValue paramTypedValue)
  {
    return paramTypedValue.assetCookie << 32 | paramTypedValue.data;
  }
  
  static PorterDuff.Mode a(int paramInt)
  {
    PorterDuff.Mode localMode;
    if (paramInt == Kd.abc_switch_thumb_material) {
      localMode = PorterDuff.Mode.MULTIPLY;
    } else {
      localMode = null;
    }
    return localMode;
  }
  
  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    try
    {
      PorterDuffColorFilter localPorterDuffColorFilter1 = c.a(paramInt, paramMode);
      PorterDuffColorFilter localPorterDuffColorFilter2 = localPorterDuffColorFilter1;
      if (localPorterDuffColorFilter1 == null)
      {
        localPorterDuffColorFilter2 = new android/graphics/PorterDuffColorFilter;
        localPorterDuffColorFilter2.<init>(paramInt, paramMode);
        c.a(paramInt, paramMode, localPorterDuffColorFilter2);
      }
      return localPorterDuffColorFilter2;
    }
    finally {}
  }
  
  private static PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return a(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
    }
    return null;
  }
  
  private Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = b(paramContext, paramInt);
    if (localObject != null)
    {
      paramContext = paramDrawable;
      if (fa.a(paramDrawable)) {
        paramContext = paramDrawable.mutate();
      }
      paramContext = a.i(paramContext);
      a.a(paramContext, (ColorStateList)localObject);
      paramDrawable = a(paramInt);
      localObject = paramContext;
      if (paramDrawable != null)
      {
        a.a(paramContext, paramDrawable);
        localObject = paramContext;
      }
    }
    else if (paramInt == Kd.abc_seekbar_track_material)
    {
      localObject = (LayerDrawable)paramDrawable;
      a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), kb.b(paramContext, Gd.colorControlNormal), a);
      a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), kb.b(paramContext, Gd.colorControlNormal), a);
      a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), kb.b(paramContext, Gd.colorControlActivated), a);
      localObject = paramDrawable;
    }
    else if ((paramInt != Kd.abc_ratingbar_material) && (paramInt != Kd.abc_ratingbar_indicator_material) && (paramInt != Kd.abc_ratingbar_small_material))
    {
      localObject = paramDrawable;
      if (!a(paramContext, paramInt, paramDrawable))
      {
        localObject = paramDrawable;
        if (paramBoolean) {
          localObject = null;
        }
      }
    }
    else
    {
      localObject = (LayerDrawable)paramDrawable;
      a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), kb.a(paramContext, Gd.colorControlNormal), a);
      a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), kb.b(paramContext, Gd.colorControlActivated), a);
      a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), kb.b(paramContext, Gd.colorControlActivated), a);
      localObject = paramDrawable;
    }
    return (Drawable)localObject;
  }
  
  private Drawable a(Context paramContext, long paramLong)
  {
    try
    {
      md localmd = (md)this.m.get(paramContext);
      if (localmd == null) {
        return null;
      }
      Object localObject = (WeakReference)localmd.b(paramLong);
      if (localObject != null)
      {
        localObject = (Drawable.ConstantState)((WeakReference)localObject).get();
        if (localObject != null)
        {
          paramContext = ((Drawable.ConstantState)localObject).newDrawable(paramContext.getResources());
          return paramContext;
        }
        localmd.a(paramLong);
      }
      return null;
    }
    finally {}
  }
  
  public static p a()
  {
    try
    {
      if (b == null)
      {
        localp = new android/support/v7/widget/p;
        localp.<init>();
        b = localp;
        a(b);
      }
      p localp = b;
      return localp;
    }
    finally {}
  }
  
  private void a(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    if (this.j == null) {
      this.j = new WeakHashMap();
    }
    vd localvd1 = (vd)this.j.get(paramContext);
    vd localvd2 = localvd1;
    if (localvd1 == null)
    {
      localvd2 = new vd();
      this.j.put(paramContext, localvd2);
    }
    localvd2.a(paramInt, paramColorStateList);
  }
  
  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (fa.a(paramDrawable)) {
      localDrawable = paramDrawable.mutate();
    }
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = a;
    }
    localDrawable.setColorFilter(a(paramInt, paramDrawable));
  }
  
  static void a(Drawable paramDrawable, nb paramnb, int[] paramArrayOfInt)
  {
    if ((fa.a(paramDrawable)) && (paramDrawable.mutate() != paramDrawable))
    {
      Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
      return;
    }
    if ((!paramnb.d) && (!paramnb.c))
    {
      paramDrawable.clearColorFilter();
    }
    else
    {
      ColorStateList localColorStateList;
      if (paramnb.d) {
        localColorStateList = paramnb.a;
      } else {
        localColorStateList = null;
      }
      if (paramnb.c) {
        paramnb = paramnb.b;
      } else {
        paramnb = a;
      }
      paramDrawable.setColorFilter(a(localColorStateList, paramnb, paramArrayOfInt));
    }
    if (Build.VERSION.SDK_INT <= 23) {
      paramDrawable.invalidateSelf();
    }
  }
  
  private static void a(p paramp)
  {
    if (Build.VERSION.SDK_INT < 24)
    {
      paramp.a("vector", new e());
      paramp.a("animated-vector", new b());
      paramp.a("animated-selector", new a());
    }
  }
  
  private void a(String paramString, d paramd)
  {
    if (this.k == null) {
      this.k = new gd();
    }
    this.k.put(paramString, paramd);
  }
  
  static boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    PorterDuff.Mode localMode = a;
    boolean bool = a(d, paramInt);
    int i1 = 16842801;
    if (bool) {
      paramInt = Gd.colorControlNormal;
    }
    for (;;)
    {
      i2 = 1;
      i1 = -1;
      break label119;
      if (a(f, paramInt))
      {
        paramInt = Gd.colorControlActivated;
      }
      else if (a(g, paramInt))
      {
        localMode = PorterDuff.Mode.MULTIPLY;
        paramInt = i1;
      }
      else
      {
        if (paramInt == Kd.abc_list_divider_mtrl_alpha)
        {
          paramInt = 16842800;
          i1 = Math.round(40.8F);
          i2 = 1;
          break label119;
        }
        if (paramInt != Kd.abc_dialog_material_background) {
          break;
        }
        paramInt = i1;
      }
    }
    int i2 = 0;
    i1 = -1;
    paramInt = 0;
    label119:
    if (i2 != 0)
    {
      Drawable localDrawable = paramDrawable;
      if (fa.a(paramDrawable)) {
        localDrawable = paramDrawable.mutate();
      }
      localDrawable.setColorFilter(a(kb.b(paramContext, paramInt), localMode));
      if (i1 != -1) {
        localDrawable.setAlpha(i1);
      }
      return true;
    }
    return false;
  }
  
  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    try
    {
      Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
      if (localConstantState != null)
      {
        md localmd = (md)this.m.get(paramContext);
        paramDrawable = localmd;
        if (localmd == null)
        {
          paramDrawable = new md;
          paramDrawable.<init>();
          this.m.put(paramContext, paramDrawable);
        }
        paramContext = new java/lang/ref/WeakReference;
        paramContext.<init>(localConstantState);
        paramDrawable.c(paramLong, paramContext);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  private static boolean a(Drawable paramDrawable)
  {
    boolean bool;
    if ((!(paramDrawable instanceof Ua)) && (!"android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = paramArrayOfInt.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (paramArrayOfInt[i2] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  private void b(Context paramContext)
  {
    if (this.o) {
      return;
    }
    this.o = true;
    paramContext = a(paramContext, Kd.abc_vector_test);
    if ((paramContext != null) && (a(paramContext))) {
      return;
    }
    this.o = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }
  
  private ColorStateList c(Context paramContext)
  {
    return c(paramContext, 0);
  }
  
  private ColorStateList c(Context paramContext, int paramInt)
  {
    int i1 = kb.b(paramContext, Gd.colorControlHighlight);
    int i2 = kb.a(paramContext, Gd.colorButtonNormal);
    int[] arrayOfInt1 = kb.b;
    int[] arrayOfInt2 = kb.e;
    int i3 = sc.b(i1, paramInt);
    paramContext = kb.c;
    i1 = sc.b(i1, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, paramContext, kb.i }, new int[] { i2, i3, i1, paramInt });
  }
  
  private ColorStateList d(Context paramContext)
  {
    return c(paramContext, kb.b(paramContext, Gd.colorAccent));
  }
  
  private Drawable d(Context paramContext, int paramInt)
  {
    if (this.n == null) {
      this.n = new TypedValue();
    }
    TypedValue localTypedValue = this.n;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    long l1 = a(localTypedValue);
    Object localObject = a(paramContext, l1);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    if (paramInt == Kd.abc_cab_background_top_material) {
      localObject = new LayerDrawable(new Drawable[] { a(paramContext, Kd.abc_cab_background_internal_bg), a(paramContext, Kd.abc_cab_background_top_mtrl_alpha) });
    }
    if (localObject != null)
    {
      ((Drawable)localObject).setChangingConfigurations(localTypedValue.changingConfigurations);
      a(paramContext, l1, (Drawable)localObject);
    }
    return (Drawable)localObject;
  }
  
  private ColorStateList e(Context paramContext)
  {
    return c(paramContext, kb.b(paramContext, Gd.colorButtonNormal));
  }
  
  private ColorStateList e(Context paramContext, int paramInt)
  {
    WeakHashMap localWeakHashMap = this.j;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localWeakHashMap != null)
    {
      paramContext = (vd)localWeakHashMap.get(paramContext);
      localObject2 = localObject1;
      if (paramContext != null) {
        localObject2 = (ColorStateList)paramContext.b(paramInt);
      }
    }
    return (ColorStateList)localObject2;
  }
  
  private ColorStateList f(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList localColorStateList = kb.c(paramContext, Gd.colorSwitchThumbNormal);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      arrayOfInt[0] = kb.b;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = kb.f;
      arrayOfInt1[1] = kb.b(paramContext, Gd.colorControlActivated);
      arrayOfInt[2] = kb.i;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    else
    {
      arrayOfInt[0] = kb.b;
      arrayOfInt1[0] = kb.a(paramContext, Gd.colorSwitchThumbNormal);
      arrayOfInt[1] = kb.f;
      arrayOfInt1[1] = kb.b(paramContext, Gd.colorControlActivated);
      arrayOfInt[2] = kb.i;
      arrayOfInt1[2] = kb.b(paramContext, Gd.colorSwitchThumbNormal);
    }
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private Drawable f(Context paramContext, int paramInt)
  {
    Object localObject1 = this.k;
    if ((localObject1 != null) && (!((ud)localObject1).isEmpty()))
    {
      localObject1 = this.l;
      if (localObject1 != null)
      {
        localObject1 = (String)((vd)localObject1).b(paramInt);
        if (("appcompat_skip_skip".equals(localObject1)) || ((localObject1 != null) && (this.k.get(localObject1) == null))) {
          return null;
        }
      }
      else
      {
        this.l = new vd();
      }
      if (this.n == null) {
        this.n = new TypedValue();
      }
      TypedValue localTypedValue = this.n;
      localObject1 = paramContext.getResources();
      ((Resources)localObject1).getValue(paramInt, localTypedValue, true);
      long l1 = a(localTypedValue);
      Drawable localDrawable = a(paramContext, l1);
      if (localDrawable != null) {
        return localDrawable;
      }
      Object localObject2 = localTypedValue.string;
      Object localObject3 = localDrawable;
      if (localObject2 != null)
      {
        localObject3 = localDrawable;
        if (((CharSequence)localObject2).toString().endsWith(".xml"))
        {
          localObject3 = localDrawable;
          try
          {
            XmlResourceParser localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
            localObject3 = localDrawable;
            localObject2 = Xml.asAttributeSet(localXmlResourceParser);
            int i1;
            do
            {
              localObject3 = localDrawable;
              i1 = localXmlResourceParser.next();
            } while ((i1 != 2) && (i1 != 1));
            if (i1 == 2)
            {
              localObject3 = localDrawable;
              localObject1 = localXmlResourceParser.getName();
              localObject3 = localDrawable;
              this.l.a(paramInt, localObject1);
              localObject3 = localDrawable;
              d locald = (d)this.k.get(localObject1);
              localObject1 = localDrawable;
              if (locald != null)
              {
                localObject3 = localDrawable;
                localObject1 = locald.a(paramContext, localXmlResourceParser, (AttributeSet)localObject2, paramContext.getTheme());
              }
              localObject3 = localObject1;
              if (localObject1 != null)
              {
                localObject3 = localObject1;
                ((Drawable)localObject1).setChangingConfigurations(localTypedValue.changingConfigurations);
                localObject3 = localObject1;
                a(paramContext, l1, (Drawable)localObject1);
                localObject3 = localObject1;
              }
            }
            else
            {
              localObject3 = localDrawable;
              paramContext = new org/xmlpull/v1/XmlPullParserException;
              localObject3 = localDrawable;
              paramContext.<init>("No start tag found");
              localObject3 = localDrawable;
              throw paramContext;
            }
          }
          catch (Exception paramContext)
          {
            Log.e("AppCompatDrawableManag", "Exception while inflating drawable", paramContext);
          }
        }
      }
      if (localObject3 == null) {
        this.l.a(paramInt, "appcompat_skip_skip");
      }
      return (Drawable)localObject3;
    }
    return null;
  }
  
  public Drawable a(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = a(paramContext, paramInt, false);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  Drawable a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    try
    {
      b(paramContext);
      Object localObject1 = f(paramContext, paramInt);
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = d(paramContext, paramInt);
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = c.c(paramContext, paramInt);
      }
      localObject2 = localObject1;
      if (localObject1 != null) {
        localObject2 = a(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
      }
      if (localObject2 != null) {
        fa.b((Drawable)localObject2);
      }
      return (Drawable)localObject2;
    }
    finally {}
  }
  
  Drawable a(Context paramContext, Cb paramCb, int paramInt)
  {
    try
    {
      Drawable localDrawable1 = f(paramContext, paramInt);
      Drawable localDrawable2 = localDrawable1;
      if (localDrawable1 == null) {
        localDrawable2 = paramCb.a(paramInt);
      }
      if (localDrawable2 != null)
      {
        paramContext = a(paramContext, paramInt, false, localDrawable2);
        return paramContext;
      }
      return null;
    }
    finally {}
  }
  
  public void a(Context paramContext)
  {
    try
    {
      paramContext = (md)this.m.get(paramContext);
      if (paramContext != null) {
        paramContext.a();
      }
      return;
    }
    finally {}
  }
  
  ColorStateList b(Context paramContext, int paramInt)
  {
    try
    {
      ColorStateList localColorStateList1 = e(paramContext, paramInt);
      ColorStateList localColorStateList2 = localColorStateList1;
      if (localColorStateList1 == null)
      {
        if (paramInt == Kd.abc_edit_text_material) {
          localColorStateList1 = Vd.a(paramContext, Id.abc_tint_edittext);
        } else if (paramInt == Kd.abc_switch_track_mtrl_alpha) {
          localColorStateList1 = Vd.a(paramContext, Id.abc_tint_switch_track);
        } else if (paramInt == Kd.abc_switch_thumb_material) {
          localColorStateList1 = f(paramContext);
        } else if (paramInt == Kd.abc_btn_default_mtrl_shape) {
          localColorStateList1 = e(paramContext);
        } else if (paramInt == Kd.abc_btn_borderless_material) {
          localColorStateList1 = c(paramContext);
        } else if (paramInt == Kd.abc_btn_colored_material) {
          localColorStateList1 = d(paramContext);
        } else if ((paramInt != Kd.abc_spinner_mtrl_am_alpha) && (paramInt != Kd.abc_spinner_textfield_background_material))
        {
          if (a(e, paramInt)) {
            localColorStateList1 = kb.c(paramContext, Gd.colorControlNormal);
          } else if (a(h, paramInt)) {
            localColorStateList1 = Vd.a(paramContext, Id.abc_tint_default);
          } else if (a(i, paramInt)) {
            localColorStateList1 = Vd.a(paramContext, Id.abc_tint_btn_checkable);
          } else if (paramInt == Kd.abc_seekbar_thumb_material) {
            localColorStateList1 = Vd.a(paramContext, Id.abc_tint_seek_thumb);
          }
        }
        else {
          localColorStateList1 = Vd.a(paramContext, Id.abc_tint_spinner);
        }
        localColorStateList2 = localColorStateList1;
        if (localColorStateList1 != null)
        {
          a(paramContext, paramInt, localColorStateList1);
          localColorStateList2 = localColorStateList1;
        }
      }
      return localColorStateList2;
    }
    finally {}
  }
  
  static class a
    implements p.d
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = Xd.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", paramContext);
      }
      return null;
    }
  }
  
  private static class b
    implements p.d
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = Na.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", paramContext);
      }
      return null;
    }
  }
  
  private static class c
    extends nd<Integer, PorterDuffColorFilter>
  {
    public c(int paramInt)
    {
      super();
    }
    
    private static int b(int paramInt, PorterDuff.Mode paramMode)
    {
      return (paramInt + 31) * 31 + paramMode.hashCode();
    }
    
    PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
    {
      return (PorterDuffColorFilter)b(Integer.valueOf(b(paramInt, paramMode)));
    }
    
    PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
    {
      return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)), paramPorterDuffColorFilter);
    }
  }
  
  private static abstract interface d
  {
    public abstract Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
  }
  
  private static class e
    implements p.d
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = Ua.createFromXmlInner(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
      }
      return null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */