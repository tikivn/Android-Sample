package vn.tiki.android.sample.data.local

import io.reactivex.Single
import vn.tiki.android.sample.model.UserLogin

/**
 * Created by trungnam1992 on 5/5/18.
 */
interface LocalResource {

    fun registerUser(userLogin: UserLogin): Single<UserLogin>
    fun requestLoginUser(userLogin: UserLogin) : Single<UserLogin>

}