package org.sil.storyproducer.model.messaging

import java.util.Date;

/**
 * Created by annmcostantino on 4/7/2018.
 */

class Message(
    val slideNumber: Int,
    val storyID: Int,
    val isConsultant: Boolean,
    val isTranscript: Boolean,
    val timeSent: Date,
    val message: String
)
