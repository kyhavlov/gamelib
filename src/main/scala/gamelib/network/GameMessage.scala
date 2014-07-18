package gamelib.network

import gamelib.util.math.Point

abstract class GameMessage

case class StateUpdate(instanceId: Int, replicationMessages: List[ReplicationMessage]) extends GameMessage

abstract class InputEvent extends GameMessage
case class MouseMove(mousePos: Point) extends InputEvent
case class MouseButton(button: Int, newState: Boolean) extends InputEvent
case class KeyInput(key: Char, newState: Boolean) extends InputEvent