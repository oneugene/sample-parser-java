package org.oneugene.log.replay

import scalaz.Lens

case class LensReplayRecord[A1, B](lens: Lens[A1, B], subRepo: Option[LensRepository[B]])
