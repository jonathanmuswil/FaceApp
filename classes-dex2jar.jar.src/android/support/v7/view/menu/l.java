package android.support.v7.view.menu;

import Dc;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.c;
import android.support.v4.view.e;
import android.support.v4.view.z;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class l
  implements Dc
{
  private static final int[] a = { 1, 4, 5, 3, 2, 0 };
  private boolean A;
  private final Context b;
  private final Resources c;
  private boolean d;
  private boolean e;
  private a f;
  private ArrayList<p> g;
  private ArrayList<p> h;
  private boolean i;
  private ArrayList<p> j;
  private ArrayList<p> k;
  private boolean l;
  private int m = 0;
  private ContextMenu.ContextMenuInfo n;
  CharSequence o;
  Drawable p;
  View q;
  private boolean r = false;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private ArrayList<p> w = new ArrayList();
  private CopyOnWriteArrayList<WeakReference<v>> x = new CopyOnWriteArrayList();
  private p y;
  private boolean z = false;
  
  public l(Context paramContext)
  {
    this.b = paramContext;
    this.c = paramContext.getResources();
    this.g = new ArrayList();
    this.h = new ArrayList();
    this.i = true;
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = true;
    e(true);
  }
  
  private static int a(ArrayList<p> paramArrayList, int paramInt)
  {
    for (int i1 = paramArrayList.size() - 1; i1 >= 0; i1--) {
      if (((p)paramArrayList.get(i1)).c() <= paramInt) {
        return i1 + 1;
      }
    }
    return 0;
  }
  
  private p a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    return new p(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
  }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = l();
    if (paramView != null)
    {
      this.q = paramView;
      this.o = null;
      this.p = null;
    }
    else
    {
      if (paramInt1 > 0) {
        this.o = localResources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.o = paramCharSequence;
      }
      if (paramInt2 > 0) {
        this.p = c.c(e(), paramInt2);
      } else if (paramDrawable != null) {
        this.p = paramDrawable;
      }
      this.q = null;
    }
    b(false);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt >= 0) && (paramInt < this.g.size()))
    {
      this.g.remove(paramInt);
      if (paramBoolean) {
        b(true);
      }
    }
  }
  
  private boolean a(D paramD, v paramv)
  {
    boolean bool1 = this.x.isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (paramv != null) {
      bool2 = paramv.a(paramD);
    }
    paramv = this.x.iterator();
    while (paramv.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)paramv.next();
      v localv = (v)localWeakReference.get();
      if (localv == null) {
        this.x.remove(localWeakReference);
      } else if (!bool2) {
        bool2 = localv.a(paramD);
      }
    }
    return bool2;
  }
  
  private void d(boolean paramBoolean)
  {
    if (this.x.isEmpty()) {
      return;
    }
    s();
    Iterator localIterator = this.x.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      v localv = (v)localWeakReference.get();
      if (localv == null) {
        this.x.remove(localWeakReference);
      } else {
        localv.a(paramBoolean);
      }
    }
    r();
  }
  
  private void e(boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramBoolean) && (this.c.getConfiguration().keyboard != 1) && (z.c(ViewConfiguration.get(this.b), this.b))) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    this.e = paramBoolean;
  }
  
  private static int f(int paramInt)
  {
    int i1 = (0xFFFF0000 & paramInt) >> 16;
    if (i1 >= 0)
    {
      int[] arrayOfInt = a;
      if (i1 < arrayOfInt.length) {
        return paramInt & 0xFFFF | arrayOfInt[i1] << 16;
      }
    }
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  public int a(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    int i1 = size();
    int i2 = paramInt2;
    if (paramInt2 < 0) {}
    for (i2 = 0; i2 < i1; i2++) {
      if (((p)this.g.get(i2)).getGroupId() == paramInt1) {
        return i2;
      }
    }
    return -1;
  }
  
  protected l a(Drawable paramDrawable)
  {
    a(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected l a(View paramView)
  {
    a(0, null, 0, null, paramView);
    return this;
  }
  
  protected l a(CharSequence paramCharSequence)
  {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  p a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.w;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty()) {
      return null;
    }
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int i2 = localArrayList.size();
    if (i2 == 1) {
      return (p)localArrayList.get(0);
    }
    boolean bool = p();
    for (int i3 = 0; i3 < i2; i3++)
    {
      paramKeyEvent = (p)localArrayList.get(i3);
      int i4;
      if (bool) {
        i4 = paramKeyEvent.getAlphabeticShortcut();
      } else {
        i4 = paramKeyEvent.getNumericShortcut();
      }
      if (((i4 == localKeyData.meta[0]) && ((i1 & 0x2) == 0)) || ((i4 == localKeyData.meta[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67))) {
        return paramKeyEvent;
      }
    }
    return null;
  }
  
  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = f(paramInt3);
    paramCharSequence = a(paramInt1, paramInt2, paramInt3, i1, paramCharSequence, this.m);
    Object localObject = this.n;
    if (localObject != null) {
      paramCharSequence.a((ContextMenu.ContextMenuInfo)localObject);
    }
    localObject = this.g;
    ((ArrayList)localObject).add(a((ArrayList)localObject, i1), paramCharSequence);
    b(true);
    return paramCharSequence;
  }
  
  public void a()
  {
    a locala = this.f;
    if (locala != null) {
      locala.a(this);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    SparseArray localSparseArray = paramBundle.getSparseParcelableArray(d());
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      MenuItem localMenuItem = getItem(i2);
      View localView = localMenuItem.getActionView();
      if ((localView != null) && (localView.getId() != -1)) {
        localView.restoreHierarchyState(localSparseArray);
      }
      if (localMenuItem.hasSubMenu()) {
        ((D)localMenuItem.getSubMenu()).a(paramBundle);
      }
    }
    i2 = paramBundle.getInt("android:menu:expandedactionview");
    if (i2 > 0)
    {
      paramBundle = findItem(i2);
      if (paramBundle != null) {
        paramBundle.expandActionView();
      }
    }
  }
  
  public void a(a parama)
  {
    this.f = parama;
  }
  
  public void a(v paramv)
  {
    a(paramv, this.b);
  }
  
  public void a(v paramv, Context paramContext)
  {
    this.x.add(new WeakReference(paramv));
    paramv.a(paramContext, this);
    this.l = true;
  }
  
  void a(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getGroupId();
    int i2 = this.g.size();
    s();
    for (int i3 = 0; i3 < i2; i3++)
    {
      p localp = (p)this.g.get(i3);
      if ((localp.getGroupId() == i1) && (localp.i()) && (localp.isCheckable()))
      {
        boolean bool;
        if (localp == paramMenuItem) {
          bool = true;
        } else {
          bool = false;
        }
        localp.b(bool);
      }
    }
    r();
  }
  
  void a(List<p> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = p();
    int i1 = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int i2 = this.g.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      p localp = (p)this.g.get(i3);
      if (localp.hasSubMenu()) {
        ((l)localp.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      }
      int i4;
      if (bool) {
        i4 = localp.getAlphabeticShortcut();
      } else {
        i4 = localp.getNumericShortcut();
      }
      int i5;
      if (bool) {
        i5 = localp.getAlphabeticModifiers();
      } else {
        i5 = localp.getNumericModifiers();
      }
      if ((i1 & 0x1100F) == (i5 & 0x1100F)) {
        i5 = 1;
      } else {
        i5 = 0;
      }
      if ((i5 != 0) && (i4 != 0))
      {
        char[] arrayOfChar = localKeyData.meta;
        if (((i4 == arrayOfChar[0]) || (i4 == arrayOfChar[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (localp.isEnabled())) {
          paramList.add(localp);
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.v) {
      return;
    }
    this.v = true;
    Iterator localIterator = this.x.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      v localv = (v)localWeakReference.get();
      if (localv == null) {
        this.x.remove(localWeakReference);
      } else {
        localv.a(this, paramBoolean);
      }
    }
    this.v = false;
  }
  
  boolean a(l paraml, MenuItem paramMenuItem)
  {
    a locala = this.f;
    boolean bool;
    if ((locala != null) && (locala.a(paraml, paramMenuItem))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean a(p paramp)
  {
    boolean bool1 = this.x.isEmpty();
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1) {
      if (this.y != paramp)
      {
        bool4 = bool2;
      }
      else
      {
        s();
        Iterator localIterator = this.x.iterator();
        bool4 = bool3;
        do
        {
          v localv;
          for (;;)
          {
            bool3 = bool4;
            if (!localIterator.hasNext()) {
              break label125;
            }
            WeakReference localWeakReference = (WeakReference)localIterator.next();
            localv = (v)localWeakReference.get();
            if (localv != null) {
              break;
            }
            this.x.remove(localWeakReference);
          }
          bool3 = localv.b(this, paramp);
          bool4 = bool3;
        } while (!bool3);
        label125:
        r();
        bool4 = bool3;
        if (bool3)
        {
          this.y = null;
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public boolean a(MenuItem paramMenuItem, int paramInt)
  {
    return a(paramMenuItem, null, paramInt);
  }
  
  public boolean a(MenuItem paramMenuItem, v paramv, int paramInt)
  {
    Object localObject = (p)paramMenuItem;
    if ((localObject != null) && (((p)localObject).isEnabled()))
    {
      boolean bool1 = ((p)localObject).g();
      paramMenuItem = ((p)localObject).a();
      int i1;
      if ((paramMenuItem != null) && (paramMenuItem.a())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      boolean bool2;
      if (((p)localObject).f())
      {
        bool1 |= ((p)localObject).expandActionView();
        bool2 = bool1;
        if (bool1)
        {
          a(true);
          bool2 = bool1;
        }
      }
      else if ((!((p)localObject).hasSubMenu()) && (i1 == 0))
      {
        bool2 = bool1;
        if ((paramInt & 0x1) == 0)
        {
          a(true);
          bool2 = bool1;
        }
      }
      else
      {
        if ((paramInt & 0x4) == 0) {
          a(false);
        }
        if (!((p)localObject).hasSubMenu()) {
          ((p)localObject).a(new D(e(), this, (p)localObject));
        }
        localObject = (D)((p)localObject).getSubMenu();
        if (i1 != 0) {
          paramMenuItem.a((SubMenu)localObject);
        }
        bool1 |= a((D)localObject, paramv);
        bool2 = bool1;
        if (!bool1)
        {
          a(true);
          bool2 = bool1;
        }
      }
      return bool2;
    }
    return false;
  }
  
  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.c.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.c.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.b.getPackageManager();
    int i1 = 0;
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i2;
    if (localList != null) {
      i2 = localList.size();
    } else {
      i2 = 0;
    }
    int i3 = i1;
    if ((paramInt4 & 0x1) == 0) {
      removeGroup(paramInt1);
    }
    for (i3 = i1; i3 < i2; i3++)
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i3);
      paramInt4 = localResolveInfo.specificIndex;
      if (paramInt4 < 0) {
        paramComponentName = paramIntent;
      } else {
        paramComponentName = paramArrayOfIntent[paramInt4];
      }
      paramComponentName = new Intent(paramComponentName);
      paramComponentName.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(paramComponentName);
      if (paramArrayOfMenuItem != null)
      {
        paramInt4 = localResolveInfo.specificIndex;
        if (paramInt4 >= 0) {
          paramArrayOfMenuItem[paramInt4] = paramComponentName;
        }
      }
    }
    return i2;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.c.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.c.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (p)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    D localD = new D(this.b, this, paramCharSequence);
    paramCharSequence.a(localD);
    return localD;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public int b(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((p)this.g.get(i2)).getItemId() == paramInt) {
        return i2;
      }
    }
    return -1;
  }
  
  public void b()
  {
    ArrayList localArrayList = n();
    if (!this.l) {
      return;
    }
    Object localObject = this.x.iterator();
    int i1 = 0;
    while (((Iterator)localObject).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject).next();
      v localv = (v)localWeakReference.get();
      if (localv == null) {
        this.x.remove(localWeakReference);
      } else {
        i1 |= localv.a();
      }
    }
    if (i1 != 0)
    {
      this.j.clear();
      this.k.clear();
      int i2 = localArrayList.size();
      for (i1 = 0; i1 < i2; i1++)
      {
        localObject = (p)localArrayList.get(i1);
        if (((p)localObject).h()) {
          this.j.add(localObject);
        } else {
          this.k.add(localObject);
        }
      }
    }
    this.j.clear();
    this.k.clear();
    this.k.addAll(n());
    this.l = false;
  }
  
  public void b(Bundle paramBundle)
  {
    int i1 = size();
    Object localObject1 = null;
    int i2 = 0;
    while (i2 < i1)
    {
      MenuItem localMenuItem = getItem(i2);
      View localView = localMenuItem.getActionView();
      Object localObject2 = localObject1;
      if (localView != null)
      {
        localObject2 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject3 = localObject1;
          if (localObject1 == null) {
            localObject3 = new SparseArray();
          }
          localView.saveHierarchyState((SparseArray)localObject3);
          localObject2 = localObject3;
          if (localMenuItem.isActionViewExpanded())
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject2 = localObject3;
          }
        }
      }
      if (localMenuItem.hasSubMenu()) {
        ((D)localMenuItem.getSubMenu()).b(paramBundle);
      }
      i2++;
      localObject1 = localObject2;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(d(), (SparseArray)localObject1);
    }
  }
  
  public void b(v paramv)
  {
    Iterator localIterator = this.x.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      v localv = (v)localWeakReference.get();
      if ((localv == null) || (localv == paramv)) {
        this.x.remove(localWeakReference);
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (!this.r)
    {
      if (paramBoolean)
      {
        this.i = true;
        this.l = true;
      }
      d(paramBoolean);
    }
    else
    {
      this.s = true;
      if (paramBoolean) {
        this.t = true;
      }
    }
  }
  
  public boolean b(p paramp)
  {
    boolean bool1 = this.x.isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    s();
    Iterator localIterator = this.x.iterator();
    do
    {
      v localv;
      for (;;)
      {
        bool1 = bool2;
        if (!localIterator.hasNext()) {
          break label97;
        }
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        localv = (v)localWeakReference.get();
        if (localv != null) {
          break;
        }
        this.x.remove(localWeakReference);
      }
      bool1 = localv.a(this, paramp);
      bool2 = bool1;
    } while (!bool1);
    label97:
    r();
    if (bool1) {
      this.y = paramp;
    }
    return bool1;
  }
  
  public l c(int paramInt)
  {
    this.m = paramInt;
    return this;
  }
  
  public ArrayList<p> c()
  {
    b();
    return this.j;
  }
  
  void c(p paramp)
  {
    this.l = true;
    b(true);
  }
  
  public void c(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public void clear()
  {
    p localp = this.y;
    if (localp != null) {
      a(localp);
    }
    this.g.clear();
    b(true);
  }
  
  public void clearHeader()
  {
    this.p = null;
    this.o = null;
    this.q = null;
    b(false);
  }
  
  public void close()
  {
    a(true);
  }
  
  protected l d(int paramInt)
  {
    a(0, null, paramInt, null, null);
    return this;
  }
  
  protected String d()
  {
    return "android:menu:actionviewstates";
  }
  
  void d(p paramp)
  {
    this.i = true;
    b(true);
  }
  
  public Context e()
  {
    return this.b;
  }
  
  protected l e(int paramInt)
  {
    a(paramInt, null, 0, null, null);
    return this;
  }
  
  public p f()
  {
    return this.y;
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (p)this.g.get(i2);
      if (((p)localObject).getItemId() == paramInt) {
        return (MenuItem)localObject;
      }
      if (((p)localObject).hasSubMenu())
      {
        localObject = ((p)localObject).getSubMenu().findItem(paramInt);
        if (localObject != null) {
          return (MenuItem)localObject;
        }
      }
    }
    return null;
  }
  
  public Drawable g()
  {
    return this.p;
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.g.get(paramInt);
  }
  
  public CharSequence h()
  {
    return this.o;
  }
  
  public boolean hasVisibleItems()
  {
    if (this.A) {
      return true;
    }
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((p)this.g.get(i2)).isVisible()) {
        return true;
      }
    }
    return false;
  }
  
  public View i()
  {
    return this.q;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool;
    if (a(paramInt, paramKeyEvent) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public ArrayList<p> j()
  {
    b();
    return this.k;
  }
  
  boolean k()
  {
    return this.u;
  }
  
  Resources l()
  {
    return this.c;
  }
  
  public l m()
  {
    return this;
  }
  
  public ArrayList<p> n()
  {
    if (!this.i) {
      return this.h;
    }
    this.h.clear();
    int i1 = this.g.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      p localp = (p)this.g.get(i2);
      if (localp.isVisible()) {
        this.h.add(localp);
      }
    }
    this.i = false;
    this.l = true;
    return this.h;
  }
  
  public boolean o()
  {
    return this.z;
  }
  
  boolean p()
  {
    return this.d;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool;
    if (paramKeyEvent != null) {
      bool = a(paramKeyEvent, paramInt2);
    } else {
      bool = false;
    }
    if ((paramInt2 & 0x2) != 0) {
      a(true);
    }
    return bool;
  }
  
  public boolean q()
  {
    return this.e;
  }
  
  public void r()
  {
    this.r = false;
    if (this.s)
    {
      this.s = false;
      b(this.t);
    }
  }
  
  public void removeGroup(int paramInt)
  {
    int i1 = a(paramInt);
    if (i1 >= 0)
    {
      int i2 = this.g.size();
      for (int i3 = 0; (i3 < i2 - i1) && (((p)this.g.get(i1)).getGroupId() == paramInt); i3++) {
        a(i1, false);
      }
      b(true);
    }
  }
  
  public void removeItem(int paramInt)
  {
    a(b(paramInt), true);
  }
  
  public void s()
  {
    if (!this.r)
    {
      this.r = true;
      this.s = false;
      this.t = false;
    }
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = this.g.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      p localp = (p)this.g.get(i2);
      if (localp.getGroupId() == paramInt)
      {
        localp.c(paramBoolean2);
        localp.setCheckable(paramBoolean1);
      }
    }
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = this.g.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      p localp = (p)this.g.get(i2);
      if (localp.getGroupId() == paramInt) {
        localp.setEnabled(paramBoolean);
      }
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = this.g.size();
    int i2 = 0;
    int i4;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      p localp = (p)this.g.get(i2);
      i4 = i3;
      if (localp.getGroupId() == paramInt)
      {
        i4 = i3;
        if (localp.e(paramBoolean)) {
          i4 = 1;
        }
      }
      i2++;
    }
    if (i3 != 0) {
      b(true);
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.d = paramBoolean;
    b(false);
  }
  
  public int size()
  {
    return this.g.size();
  }
  
  public static abstract interface a
  {
    public abstract void a(l paraml);
    
    public abstract boolean a(l paraml, MenuItem paramMenuItem);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(p paramp);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */