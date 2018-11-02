package ru.evotor.framework.counterparties.collaboration.agent_scheme.mapper

import android.os.Bundle
import ru.evotor.framework.counterparties.collaboration.agent_scheme.Agent
import ru.evotor.framework.counterparties.mapper.CounterpartyMapper

internal object AgentMapper {

    private const val KEY_TYPE = "TYPE"

    fun read(bundle: Bundle?): Agent? =
            bundle?.let {
                Agent(
                        uuid = CounterpartyMapper.readUuid(it),
                        type = Agent.Type.values()[it.getInt(KEY_TYPE)],
                        counterpartyType = CounterpartyMapper.readCounterpartyType(it),
                        fullName = CounterpartyMapper.readFullName(it),
                        shortName = CounterpartyMapper.readShortName(it),
                        inn = CounterpartyMapper.readInn(it),
                        kpp = CounterpartyMapper.readKpp(it),
                        contacts = CounterpartyMapper.readContacts(it)
                )
            }

    fun write(agent: Agent, bundle: Bundle) = bundle.apply {
        agent.type?.let { this.putInt(KEY_TYPE, it.ordinal) }
    }

    fun convertToNull(agent: Agent): Agent? =
            CounterpartyMapper.convertToNull(agent)?.let {
                if (it.type == null)
                    null
                else
                    it
            }

}