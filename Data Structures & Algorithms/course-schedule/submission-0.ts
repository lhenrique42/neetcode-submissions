class Solution {
    /**
     * @param {number} numCourses
     * @param {number[][]} prerequisites
     * @return {boolean}
     */
    canFinish(numCourses: number, prerequisites: number[][]): boolean {
        let adjList: Array<Array<number>> = Array.from({ length: numCourses }, () => []);

        for (let edge of prerequisites) {
            adjList[edge[0]].push(edge[1]);
        }

        let visited: boolean[] = new Array().fill(false);
        let recursiveStack: boolean[] = new Array().fill(false);

        for (let i = 0; i < numCourses; ++i) {
            if (!visited[i] && this.dfs(visited, recursiveStack, i, adjList)) {
                return false;
            }
        }
        return true;
    }

    dfs(visited: boolean[], recursiveStack: boolean[], vertex_u: number, adjList: Array<Array<number>>): boolean {

        if (recursiveStack[vertex_u]) {
            return true;
        }

        if (visited[vertex_u]) {
            return false;
        }

        visited[vertex_u] = true;
        recursiveStack[vertex_u] = true;

        for (let v = 0; v < adjList[vertex_u].length; ++v) {
            if (this.dfs(visited, recursiveStack, adjList[vertex_u].at(v), adjList)) {
                return true;
            }
        }

        recursiveStack[vertex_u] = false;

        return false;
    }
}
