import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.e;
import android.support.v4.view.j;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.widget.fa;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class pe
  extends MenuInflater
{
  static final Class<?>[] a = { Context.class };
  static final Class<?>[] b = a;
  final Object[] c;
  final Object[] d;
  Context e;
  private Object f;
  
  public pe(Context paramContext)
  {
    super(paramContext);
    this.e = paramContext;
    this.c = new Object[] { paramContext };
    this.d = this.c;
  }
  
  private Object a(Object paramObject)
  {
    if ((paramObject instanceof Activity)) {
      return paramObject;
    }
    Object localObject = paramObject;
    if ((paramObject instanceof ContextWrapper)) {
      localObject = a(((ContextWrapper)paramObject).getBaseContext());
    }
    return localObject;
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
    throws XmlPullParserException, IOException
  {
    pe.b localb = new pe.b(paramMenu);
    int i = paramXmlPullParser.getEventType();
    int j;
    do
    {
      if (i == 2)
      {
        paramMenu = paramXmlPullParser.getName();
        if (paramMenu.equals("menu"))
        {
          j = paramXmlPullParser.next();
          break;
        }
        paramXmlPullParser = new StringBuilder();
        paramXmlPullParser.append("Expecting menu, got ");
        paramXmlPullParser.append(paramMenu);
        throw new RuntimeException(paramXmlPullParser.toString());
      }
      j = paramXmlPullParser.next();
      i = j;
    } while (j != 1);
    Object localObject = null;
    i = 0;
    int k = 0;
    int m = j;
    while (i == 0) {
      if (m != 1)
      {
        int n;
        if (m != 2)
        {
          if (m != 3)
          {
            j = k;
            paramMenu = (Menu)localObject;
            n = i;
          }
          else
          {
            String str = paramXmlPullParser.getName();
            if ((k != 0) && (str.equals(localObject)))
            {
              paramMenu = null;
              j = 0;
              n = i;
            }
            else if (str.equals("group"))
            {
              localb.d();
              j = k;
              paramMenu = (Menu)localObject;
              n = i;
            }
            else if (str.equals("item"))
            {
              j = k;
              paramMenu = (Menu)localObject;
              n = i;
              if (!localb.c())
              {
                paramMenu = localb.A;
                if ((paramMenu != null) && (paramMenu.a()))
                {
                  localb.b();
                  j = k;
                  paramMenu = (Menu)localObject;
                  n = i;
                }
                else
                {
                  localb.a();
                  j = k;
                  paramMenu = (Menu)localObject;
                  n = i;
                }
              }
            }
            else
            {
              j = k;
              paramMenu = (Menu)localObject;
              n = i;
              if (str.equals("menu"))
              {
                n = 1;
                j = k;
                paramMenu = (Menu)localObject;
              }
            }
          }
        }
        else if (k != 0)
        {
          j = k;
          paramMenu = (Menu)localObject;
          n = i;
        }
        else
        {
          paramMenu = paramXmlPullParser.getName();
          if (paramMenu.equals("group"))
          {
            localb.a(paramAttributeSet);
            j = k;
            paramMenu = (Menu)localObject;
            n = i;
          }
          else if (paramMenu.equals("item"))
          {
            localb.b(paramAttributeSet);
            j = k;
            paramMenu = (Menu)localObject;
            n = i;
          }
          else if (paramMenu.equals("menu"))
          {
            a(paramXmlPullParser, paramAttributeSet, localb.b());
            j = k;
            paramMenu = (Menu)localObject;
            n = i;
          }
          else
          {
            j = 1;
            n = i;
          }
        }
        m = paramXmlPullParser.next();
        k = j;
        localObject = paramMenu;
        i = n;
      }
      else
      {
        throw new RuntimeException("Unexpected end of document");
      }
    }
  }
  
  Object a()
  {
    if (this.f == null) {
      this.f = a(this.e);
    }
    return this.f;
  }
  
  /* Error */
  public void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 139
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 141	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 36	pe:e	Landroid/content/Context;
    //   26: invokevirtual 145	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 151	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 5
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 4
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 157	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 129	pe:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull +10 -> 70
    //   63: aload 6
    //   65: invokeinterface 162 1 0
    //   70: return
    //   71: astore_2
    //   72: goto +55 -> 127
    //   75: astore_2
    //   76: aload_3
    //   77: astore 5
    //   79: new 164	android/view/InflateException
    //   82: astore 4
    //   84: aload_3
    //   85: astore 5
    //   87: aload 4
    //   89: ldc -90
    //   91: aload_2
    //   92: invokespecial 169	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: aload_3
    //   96: astore 5
    //   98: aload 4
    //   100: athrow
    //   101: astore_3
    //   102: aload 4
    //   104: astore 5
    //   106: new 164	android/view/InflateException
    //   109: astore_2
    //   110: aload 4
    //   112: astore 5
    //   114: aload_2
    //   115: ldc -90
    //   117: aload_3
    //   118: invokespecial 169	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   121: aload 4
    //   123: astore 5
    //   125: aload_2
    //   126: athrow
    //   127: aload 5
    //   129: ifnull +10 -> 139
    //   132: aload 5
    //   134: invokeinterface 162 1 0
    //   139: aload_2
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	pe
    //   0	141	1	paramInt	int
    //   0	141	2	paramMenu	Menu
    //   15	81	3	localObject1	Object
    //   101	17	3	localXmlPullParserException	XmlPullParserException
    //   17	105	4	localObject2	Object
    //   20	113	5	localObject3	Object
    //   33	31	6	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	71	finally
    //   46	58	71	finally
    //   79	84	71	finally
    //   87	95	71	finally
    //   98	101	71	finally
    //   106	110	71	finally
    //   114	121	71	finally
    //   125	127	71	finally
    //   22	35	75	java/io/IOException
    //   46	58	75	java/io/IOException
    //   22	35	101	org/xmlpull/v1/XmlPullParserException
    //   46	58	101	org/xmlpull/v1/XmlPullParserException
  }
  
  private static class a
    implements MenuItem.OnMenuItemClickListener
  {
    private static final Class<?>[] a = { MenuItem.class };
    private Object b;
    private Method c;
    
    public a(Object paramObject, String paramString)
    {
      this.b = paramObject;
      Class localClass = paramObject.getClass();
      try
      {
        this.c = localClass.getMethod(paramString, a);
        return;
      }
      catch (Exception paramObject)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Couldn't resolve menu item onClick handler ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" in class ");
        localStringBuilder.append(localClass.getName());
        paramString = new InflateException(localStringBuilder.toString());
        paramString.initCause((Throwable)paramObject);
        throw paramString;
      }
    }
    
    public boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      try
      {
        if (this.c.getReturnType() == Boolean.TYPE) {
          return ((Boolean)this.c.invoke(this.b, new Object[] { paramMenuItem })).booleanValue();
        }
        this.c.invoke(this.b, new Object[] { paramMenuItem });
        return true;
      }
      catch (Exception paramMenuItem)
      {
        throw new RuntimeException(paramMenuItem);
      }
    }
  }
  
  private class b
  {
    e A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D = null;
    private PorterDuff.Mode E = null;
    private Menu a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private int m;
    private char n;
    private int o;
    private char p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private String x;
    private String y;
    private String z;
    
    public b(Menu paramMenu)
    {
      this.a = paramMenu;
      d();
    }
    
    private char a(String paramString)
    {
      if (paramString == null) {
        return '\000';
      }
      return paramString.charAt(0);
    }
    
    private <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
    {
      try
      {
        paramArrayOfClass = pe.this.e.getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
        paramArrayOfClass.setAccessible(true);
        paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
        return paramArrayOfClass;
      }
      catch (Exception paramArrayOfClass)
      {
        paramArrayOfObject = new StringBuilder();
        paramArrayOfObject.append("Cannot instantiate class: ");
        paramArrayOfObject.append(paramString);
        Log.w("SupportMenuInflater", paramArrayOfObject.toString(), paramArrayOfClass);
      }
      return null;
    }
    
    private void a(MenuItem paramMenuItem)
    {
      Object localObject = paramMenuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
      int i1 = this.r;
      int i2 = 0;
      if (i1 >= 1) {
        bool = true;
      } else {
        bool = false;
      }
      ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.l).setIcon(this.m);
      i1 = this.v;
      if (i1 >= 0) {
        paramMenuItem.setShowAsAction(i1);
      }
      if (this.z != null) {
        if (!pe.this.e.isRestricted()) {
          paramMenuItem.setOnMenuItemClickListener(new pe.a(pe.this.a(), this.z));
        } else {
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        }
      }
      boolean bool = paramMenuItem instanceof p;
      if (bool) {
        localObject = (p)paramMenuItem;
      }
      if (this.r >= 2) {
        if (bool) {
          ((p)paramMenuItem).c(true);
        } else if ((paramMenuItem instanceof q)) {
          ((q)paramMenuItem).a(true);
        }
      }
      localObject = this.x;
      if (localObject != null)
      {
        paramMenuItem.setActionView((View)a((String)localObject, pe.a, pe.this.c));
        i2 = 1;
      }
      i1 = this.w;
      if (i1 > 0) {
        if (i2 == 0) {
          paramMenuItem.setActionView(i1);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }
      }
      localObject = this.A;
      if (localObject != null) {
        j.a(paramMenuItem, (e)localObject);
      }
      j.a(paramMenuItem, this.B);
      j.b(paramMenuItem, this.C);
      j.a(paramMenuItem, this.n, this.o);
      j.b(paramMenuItem, this.p, this.q);
      localObject = this.E;
      if (localObject != null) {
        j.a(paramMenuItem, (PorterDuff.Mode)localObject);
      }
      localObject = this.D;
      if (localObject != null) {
        j.a(paramMenuItem, (ColorStateList)localObject);
      }
    }
    
    public void a()
    {
      this.h = true;
      a(this.a.add(this.b, this.i, this.j, this.k));
    }
    
    public void a(AttributeSet paramAttributeSet)
    {
      paramAttributeSet = pe.this.e.obtainStyledAttributes(paramAttributeSet, Pd.MenuGroup);
      this.b = paramAttributeSet.getResourceId(Pd.MenuGroup_android_id, 0);
      this.c = paramAttributeSet.getInt(Pd.MenuGroup_android_menuCategory, 0);
      this.d = paramAttributeSet.getInt(Pd.MenuGroup_android_orderInCategory, 0);
      this.e = paramAttributeSet.getInt(Pd.MenuGroup_android_checkableBehavior, 0);
      this.f = paramAttributeSet.getBoolean(Pd.MenuGroup_android_visible, true);
      this.g = paramAttributeSet.getBoolean(Pd.MenuGroup_android_enabled, true);
      paramAttributeSet.recycle();
    }
    
    public SubMenu b()
    {
      this.h = true;
      SubMenu localSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
      a(localSubMenu.getItem());
      return localSubMenu;
    }
    
    public void b(AttributeSet paramAttributeSet)
    {
      paramAttributeSet = pe.this.e.obtainStyledAttributes(paramAttributeSet, Pd.MenuItem);
      this.i = paramAttributeSet.getResourceId(Pd.MenuItem_android_id, 0);
      this.j = (paramAttributeSet.getInt(Pd.MenuItem_android_menuCategory, this.c) & 0xFFFF0000 | paramAttributeSet.getInt(Pd.MenuItem_android_orderInCategory, this.d) & 0xFFFF);
      this.k = paramAttributeSet.getText(Pd.MenuItem_android_title);
      this.l = paramAttributeSet.getText(Pd.MenuItem_android_titleCondensed);
      this.m = paramAttributeSet.getResourceId(Pd.MenuItem_android_icon, 0);
      this.n = a(paramAttributeSet.getString(Pd.MenuItem_android_alphabeticShortcut));
      this.o = paramAttributeSet.getInt(Pd.MenuItem_alphabeticModifiers, 4096);
      this.p = a(paramAttributeSet.getString(Pd.MenuItem_android_numericShortcut));
      this.q = paramAttributeSet.getInt(Pd.MenuItem_numericModifiers, 4096);
      if (paramAttributeSet.hasValue(Pd.MenuItem_android_checkable)) {
        this.r = paramAttributeSet.getBoolean(Pd.MenuItem_android_checkable, false);
      } else {
        this.r = this.e;
      }
      this.s = paramAttributeSet.getBoolean(Pd.MenuItem_android_checked, false);
      this.t = paramAttributeSet.getBoolean(Pd.MenuItem_android_visible, this.f);
      this.u = paramAttributeSet.getBoolean(Pd.MenuItem_android_enabled, this.g);
      this.v = paramAttributeSet.getInt(Pd.MenuItem_showAsAction, -1);
      this.z = paramAttributeSet.getString(Pd.MenuItem_android_onClick);
      this.w = paramAttributeSet.getResourceId(Pd.MenuItem_actionLayout, 0);
      this.x = paramAttributeSet.getString(Pd.MenuItem_actionViewClass);
      this.y = paramAttributeSet.getString(Pd.MenuItem_actionProviderClass);
      int i1;
      if (this.y != null) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i1 != 0) && (this.w == 0) && (this.x == null))
      {
        this.A = ((e)a(this.y, pe.b, pe.this.d));
      }
      else
      {
        if (i1 != 0) {
          Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
        }
        this.A = null;
      }
      this.B = paramAttributeSet.getText(Pd.MenuItem_contentDescription);
      this.C = paramAttributeSet.getText(Pd.MenuItem_tooltipText);
      if (paramAttributeSet.hasValue(Pd.MenuItem_iconTintMode)) {
        this.E = fa.a(paramAttributeSet.getInt(Pd.MenuItem_iconTintMode, -1), this.E);
      } else {
        this.E = null;
      }
      if (paramAttributeSet.hasValue(Pd.MenuItem_iconTint)) {
        this.D = paramAttributeSet.getColorStateList(Pd.MenuItem_iconTint);
      } else {
        this.D = null;
      }
      paramAttributeSet.recycle();
      this.h = false;
    }
    
    public boolean c()
    {
      return this.h;
    }
    
    public void d()
    {
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = true;
      this.g = true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */