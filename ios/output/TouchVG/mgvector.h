//! \file mgvector.h
//! \brief Template vector definition for SWIG.
// License: LGPL, https://github.com/rhcad/touchvg

#ifndef SWIG_MGVECTOR_H
#define SWIG_MGVECTOR_H

//! Template vector definition for SWIG.
template<class T> class mgvector {
private:
    T *_v;
    int _n;
public:
    ~mgvector() {
        delete[] _v;
    }
    mgvector(int n = 0) {
        _v = n > 0 ? new T[n] : (T*)0;
        _n = n;
    }
    void setSize(int n) {
        if (!_v) {
            _v = n > 0 ? new T[n] : (T*)0;
            _n = n;
        }
    }
    template<class T2>
    mgvector(const T2 *v, int n) : _v((T*)0), _n(0) {
        if (v && n > 0) {
            _v = new T[n];
            _n = n;
            for (int i = 0; i < n; i++)
                _v[i] = (T)v[i];
        }
    }
    template<class T2>
    mgvector(const T2 v1, const T2 v2) {
        _v = new T[2];
        _n = 2;
        _v[0] = (T)v1;
        _v[1] = (T)v2;
    }
    template<class T2>
    mgvector(const T2 v1, const T2 v2, const T2 v3, const T2 v4) {
        _v = new T[4];
        _n = 4;
        _v[0] = (T)v1;
        _v[1] = (T)v2;
        _v[2] = (T)v3;
        _v[3] = (T)v4;
    }
#ifndef SWIG
    T *address() { return _v; }
#endif
    int count() const {
        return this ? _n : 0;
    }
    T get(int index) const {
        return (index >= 0 && index < _n) ? _v[index] : (T)0;
    }
    void set(int index, T value) {
        if (index >= 0 && index < _n) {
            _v[index] = value;
        }
    }
    void set(int index, T v1, T v2) {
        if (index >= 0 && index + 1 < _n) {
            _v[index] = v1;
            _v[index+1] = v2;
        }
    }
};

#endif // SWIG_MGVECTOR_H
