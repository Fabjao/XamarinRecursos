package md5ee710abd4c2fbb17e7199fe6f99120e0;


public class FiapBoxViewRenderer
	extends md5b60ffeb829f638581ab2bb9b1a7f4f3f.BoxRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("XF.Recursos.Droid.FiapBoxViewRenderer, XF.Recursos.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FiapBoxViewRenderer.class, __md_methods);
	}


	public FiapBoxViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == FiapBoxViewRenderer.class)
			mono.android.TypeManager.Activate ("XF.Recursos.Droid.FiapBoxViewRenderer, XF.Recursos.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public FiapBoxViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == FiapBoxViewRenderer.class)
			mono.android.TypeManager.Activate ("XF.Recursos.Droid.FiapBoxViewRenderer, XF.Recursos.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public FiapBoxViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == FiapBoxViewRenderer.class)
			mono.android.TypeManager.Activate ("XF.Recursos.Droid.FiapBoxViewRenderer, XF.Recursos.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
