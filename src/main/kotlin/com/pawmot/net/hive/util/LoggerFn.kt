package com.pawmot.net.hive.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

inline fun <reified T> loggerFor(): Logger = LoggerFactory.getLogger(T::class.java)