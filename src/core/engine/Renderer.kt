package core.engine

import models.RawModel
import org.lwjgl.opengl.GL11
import org.lwjgl.opengl.GL20
import org.lwjgl.opengl.GL30

class Renderer {
    fun prepare() {
        // 1F rgba equals MAX(255F)
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT)
        GL11.glClearColor(1F, 0F, 0F, 1F)
    }

    fun render(rawModel: RawModel) {
        GL30.glBindVertexArray(rawModel.vaoID)
        GL20.glEnableVertexAttribArray(0)
        GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, rawModel.vertexCount)
        GL30.glBindVertexArray(0)
    }
}
