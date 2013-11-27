/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.core;

public class MgLayer extends MgShapes {
  private long swigCPtr;

  protected MgLayer(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgLayer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgLayer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static int Type() {
    return touchvgJNI.MgLayer_Type();
  }

  public MgLayer cloneLayer() {
    long cPtr = touchvgJNI.MgLayer_cloneLayer(swigCPtr, this);
    return (cPtr == 0) ? null : new MgLayer(cPtr, false);
  }

  public static MgLayer create(MgShapeDoc doc, int index) {
    long cPtr = touchvgJNI.MgLayer_create(MgShapeDoc.getCPtr(doc), doc, index);
    return (cPtr == 0) ? null : new MgLayer(cPtr, false);
  }

  public MgShapeDoc doc() {
    long cPtr = touchvgJNI.MgLayer_doc(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public boolean isHided() {
    return touchvgJNI.MgLayer_isHided(swigCPtr, this);
  }

  public void setHided(boolean hided) {
    touchvgJNI.MgLayer_setHided(swigCPtr, this, hided);
  }

  public boolean isLocked() {
    return touchvgJNI.MgLayer_isLocked(swigCPtr, this);
  }

  public void setLocked(boolean locked) {
    touchvgJNI.MgLayer_setLocked(swigCPtr, this, locked);
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgLayer_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgLayer_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgLayer_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgLayer_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgLayer_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgLayer_isKindOf(swigCPtr, this, type);
  }

}
