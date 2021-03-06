/**
 * Copyright (c) LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.dex.spec

import java.nio.ByteBuffer

data class StringIdItem(
        val stringDataOff: Int
) {
    companion object {
        val size: Int = 4
    }

    constructor(byteBuffer: ByteBuffer) : this(
            stringDataOff = byteBuffer.int
    )
}